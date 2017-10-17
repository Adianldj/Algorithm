package PhoneIXL;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class convertlettertoNumber {
	public String convert(String s){
		if(s == null || s.length() == 0){
			return s;
		}
		Map<Character , Integer> map = new HashMap<Character , Integer>();
		map.put('a', 1);
		map.put('b', 2);
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < s.length() ; i++){
			if(Character.isLetter(s.charAt(i))){
				sb.append(map.get(s.charAt(i)) + "");
			}else{
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		convertlettertoNumber solution = new convertlettertoNumber();
		String input = "aabb892";
	
		String result;
		result = solution.convert(input);
		System.out.println(result);
		
		
	}
}
//time:O(n)
//space:O(n)