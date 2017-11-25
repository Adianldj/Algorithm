package MicrosoftOnsite;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreak {
	 public boolean wordBreak(String s, List<String> wordDict) {
	       boolean[] breakable = new boolean[s.length() + 1];
	        Set<String> set = new HashSet<String>();
	        for(String word : wordDict){
	            set.add(word);
	        }
	        breakable[0] = true;
	        for(int i = 1 ; i <= s.length() ; i++){
	            for(int j = 0 ; j < i ; j++){
	                if(breakable[j] && set.contains(s.substring(j , i))){
	                    breakable[i] = true;
	                    break;
	                }
	            }
	        }
	        return breakable[s.length()];
}
}
