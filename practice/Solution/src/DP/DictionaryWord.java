package DP;

import java.util.HashSet;

import java.util.Set;



public class DictionaryWord {
	public boolean canBreak(String input , String[] dict){
		Set<String> set = getSet(dict);
		boolean[] breakable = new boolean[input.length() + 1]; 
		breakable[0] = true;
		for(int i = 1 ; i <= input.length() ; i++){
			for(int j = 0 ; j <= i ; j++){
				if(breakable[j] && set.contains(input.substring(j, i))){
					breakable[i] = true;
					break;
				}
			}
		}
		return breakable[input.length()];
	}
	private Set<String> getSet(String[] dict){
		Set<String> set = new HashSet<String>();
		for(int i = 0 ; i < dict.length ; i++){
			set.add(dict[i]);
		}
		return set;
	}
	public static void main(String[] args) {
		DictionaryWord solution = new DictionaryWord();
		String input = "dianjin";
		String[] s = new String[]{"dianjin"};
		boolean result;
		result = solution.canBreak(input , s);
	
			System.out.println(result);

		
		
	}
}
