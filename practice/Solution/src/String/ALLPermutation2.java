package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ALLPermutation2 {
	public List<String> allPermutation(String set){
		List<String> result = new ArrayList<String>();
		if(set == null){
			return result;
		}
		char[] array = set.toCharArray();
		helper(result , 0 , array);
		return result;
	}
	private void helper(List<String> result , int index , char[] array){
		if(index == array.length){
			result.add(new String(array));
			return;
		}
		Set<Character> set = new HashSet<Character>();
		for(int i = index ; i < array.length ; i++){
			if(!set.contains(array[i])){
				set.add(array[i]);
				swap(array , index , i);
				helper(result , index + 1 , array);
				swap(array , index , i);
			}
		}
	}
	private void swap(char[] array , int i , int j){
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public static void main(String[] args) {
		ALLPermutation2 solution = new ALLPermutation2();
		String input = null;
		List<String> result;
		result = solution.allPermutation(input);
		if(result == null){
			System.out.println(result);
		}
		for(int i = 0 ; i < result.size() ; i++){
			System.out.println(result.get(i));
		}

	}
}
