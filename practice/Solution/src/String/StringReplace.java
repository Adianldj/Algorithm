package String;

import java.util.ArrayList;
import java.util.List;

public class StringReplace {
	public String replace( String input , String s , String t){
		char[] array = input.toCharArray();
		if(s.length() >= t.length()){
			return replaceShorter(array , s , t);
		}else{
			return replaceLonger(array , s , t);
		}
	}
	private String replaceShorter(char[] array , String s , String t){
		int slow = 0;
		int fast = 0;
		while(fast < array.length){
			if(fast <= array.length - s.length() && equalString(array , fast , s)){
				copyString(array , slow , t);
				slow = slow + t.length();
				fast = fast + s.length();
			}else{
				array[slow++] = array[fast++];
			}
		}
		return new String(array , 0 , slow);
	}
	private String replaceLonger(char[] array , String s , String t){
		List<Integer> matches = getAllMatches(array , s);
		char[] result = new char[array.length + (t.length() - s.length()) * matches.size()];
		int fast = result.length - 1;
		int slow = array.length - 1;
		int lastindex = matches.size() - 1;
		while(slow >= 0){
			if(lastindex >= 0 && slow == matches.get(lastindex)){
				copyString(result , fast - t.length() + 1 , t);
				fast = fast - t.length();
				slow = slow - s.length();
				lastindex--;
			}else{
				result[fast--] = array[slow--];
			}
		}
		return new String(result);
	}
	private boolean equalString(char[] array , int index , String s){
		for(int i = index ; i < index + s.length() ; i++){
			if(array[i] != s.charAt(i - index)){
				return false;
			}
		}
		return true;
	}
	private void copyString(char[] array , int index , String t){
		for(int i = index ; i < index + t.length() ; i++){
			array[i] = t.charAt(i - index);
		}
	}
	private List<Integer> getAllMatches(char[] array , String s){
		int i = 0;
		List<Integer> matches = new ArrayList<Integer>();
		while(i <= array.length - s.length()){
			if(equalString(array , i , s)){
				matches.add(i + s.length() - 1);
				i = i + s.length();
			}else{
				i++;
			}
		}
		return  matches;
	}
	public static void main(String[] args) {
		StringReplace solution = new StringReplace();
		String input = "aaa";
		String S = "aa";
		String T = "bbb";
		String result;
		result = solution.replace(input , S , T);
	    System.out.println(result);
		

	}
}
