package PhoneIXL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class permutation2 {
	public List<List<Integer>> Permutation2(int[] nums){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(nums == null){
			return result;
		}
		helper(result , 0 , nums);
		return result;
	}
	private void helper(List<List<Integer>> result , int index , int[] nums){
		if(index == nums.length - 1){
			List<Integer> temp = Arrays.stream(nums).boxed().collect(Collectors.toList()); 
			result.add(new ArrayList<Integer>(temp));
			return;
		}
		Set<Integer> set = new HashSet<Integer>();
		for(int i = index ; i < nums.length ; i++){
			if(!set.contains(nums[i])){
				set.add(nums[i]);
				swap(nums , index , i);
				helper(result , index + 1 , nums);
				swap(nums , index , i);
			}
		}
	}
	private void swap(int[] nums , int i , int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
//Time/Space:O(n)
