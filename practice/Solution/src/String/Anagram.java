package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
	public List<Integer> allAnagrams(String s , String l){
		List<Integer> result = new ArrayList<Integer>();
		if(l == null || s.length() >= l.length()){
			return result;
		}
		Map<Character , Integer> map = new HashMap<>();
		char[] arrays = s.toCharArray();
		char[] arrayl = l.toCharArray();
		int match = 0;
		for(int i = 0 ; i < arrays.length ; i++){
			if(!map.containsKey(arrays[i])){
				map.put(arrays[i] , 1);
			}else{
				int n = map.get(arrays[i]);
				map.put(arrays[i] , n + 1);
			}
		}
		for(int i = 0 ; i < arrayl.length ; i++){
			Integer count = map.get(arrayl[i]);
			if(count != null){
				map.put(arrayl[i] , count - 1);
				if(count == 1){
					match++;
				}
			}
			if(i >= s.length()){
				Integer number = map.get(arrayl[i - s.length()]);
				if(number != null){
					map.put(arrayl[i - s.length()] , number + 1);
					if(number == 0){
						match--;
					}
				}
			}
			if(match == map.size()){
				result.add(i - s.length() + 1);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Anagram solution = new Anagram();
		String input = null;
		String s = "y";
		List<Integer> result;
		result = solution.allAnagrams(s , input);
		for(int i = 0 ; i < result.size() ; i++){
			System.out.println(result.get(i));
		}
		
		
	}
}
