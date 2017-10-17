package PhoneIXL;

import java.util.HashSet;
import java.util.Set;

public class FirstCharacter {
	public char firstrepeating(String s){
		Set<Character> set = new HashSet<Character>();
		for(int i = 0 ; i < s.length() ; i++){
			if(set.contains(s.charAt(i))){
				return s.charAt(i);
			}else{
				set.add(s.charAt(i));
			}
		}
		return '\0';
	}
	
}
//Time/space: o(n)
