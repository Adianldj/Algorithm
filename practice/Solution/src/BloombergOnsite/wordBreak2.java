package BloombergOnsite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wordBreak2 {
	private List<String> wordbreak(String word , List<String> wordDict){
		Map<String , List<String>> map = new HashMap<String , List<String>>();
		return DFS(word , wordDict , map);
	}
	private List<String> DFS(String word , List<String> wordDict , Map<String , List<String>> map){
		if(map.containsKey(word)){
			return map.get(word);
		}
		List<String> result = new ArrayList<String>();
		if(word.length() == 0){
			result.add("");
			return result;
		}
		for(String s : wordDict){
			if(word.startsWith(s)){
				List<String> subList = DFS(word.substring(s.length()) , wordDict , map);
				for(String sub : subList){
					result.add(s + (sub.isEmpty() ? "" : " ") + sub);
				}
			}
		}
		map.put(word , result);
		return result;
	}
}
