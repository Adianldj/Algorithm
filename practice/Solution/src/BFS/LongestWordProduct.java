package BFS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestWordProduct {
	public int Longest(String[] dict){
		Map<String , Integer> map = getBitMap(dict);
		Arrays.sort(dict , new MyComparator());
		int largest = 0;
		for(int i = 1 ; i < dict.length ; i++){
			for(int j = 0 ; j < i ; j++){
				if(dict[i].length() * dict[j].length() <= largest){
					break;
				}
				int li = map.get(dict[i]);
				int lj = map.get(dict[j]);
				if((li & lj) == 0){
					largest = dict[i].length() * dict[j].length();
				}
			}
		}
		return largest;
	}
	static class MyComparator implements Comparator<String>{
		@Override
		public int compare(String s1 , String s2){
			if(s1.length() == s2.length()){
				return 0;
			}
			return s1.length() < s2.length() ? 1 : -1;
		}
	}
	private Map<String , Integer> getBitMap(String[] dict){
		Map<String , Integer> map = new HashMap<>();
		for(String n : dict){
			int bitmask = 0;
			for(int i = 0 ; i < n.length() ; i++){
				bitmask |= 1 << (n.charAt(i) - 'a');
			}
			map.put(n, bitmask);
		}
		return map;
	}
}
