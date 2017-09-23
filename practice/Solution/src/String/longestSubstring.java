package String;

import java.util.HashMap;
import java.util.Map;

public class longestSubstring {
	public int longest(String input){
		if(input == null || input.length() <= 0){
			return 0;
		}
		char[] array = input.toCharArray();
		Map<Character , Integer> map = new HashMap<>();
		int start = 0;
		int length = 0;
		for(int i = 0 ; i < array.length ; i++){
			if(!map.containsKey(array[i])){
				map.put(array[i] , i);
				length = Math.max(length , i - start + 1);
			}else{
				start = map.get(array[i]) + 1;
				map.put(array[i] , i);
			}
		}
		return length;
	}
	public static void main(String[] args) {
		longestSubstring solution = new longestSubstring();
		String input = "g";
		int result;
		result = solution.longest(input);
		System.out.println(result);
		
	}
}
