package PhoneIXL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {
	public List<List<Integer>> permute(int[] nums){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(nums == null){
			return result;
		}
		helper(result, nums , 0);
		return result;
	}
	private void helper(List<List<Integer>> result , int[] nums , int index){
		if(index == nums.length - 1){
			List<Integer> temp = Arrays.stream(nums).boxed().collect(Collectors.toList()); 
			result.add(new ArrayList<Integer>(temp));
			return;
		}
		for(int i = index ; i < nums.length ; i++){
			swap(nums , index , i);
			helper(result , nums , index + 1);
			swap(nums , index , i);
		}
	}
	private void swap(int[] array , int i , int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
