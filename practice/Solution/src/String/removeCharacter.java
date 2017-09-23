package String;

import java.util.HashSet;
import java.util.Set;

public class removeCharacter {
		public String remove(String input , String t){
			Set<Character> set = getSet(t);
			if(input == null || input.length() == 0){
				return input;
			}
			char[] array = input.toCharArray();
			int end = 0;

			for(int i = 0 ; i < array.length ; i++){
				if(set.contains(array[i])){
					continue;
				}
				array[end++] = array[i];
			}
			return new String(array , 0 , end);
		}
		public Set<Character> getSet(String t){
			char[] array = t.toCharArray();
			Set<Character> set = new HashSet<Character>();
			for(int i = 0 ; i < array.length ; i++){
				set.add(array[i]);
			}
			return set;
		}
}
