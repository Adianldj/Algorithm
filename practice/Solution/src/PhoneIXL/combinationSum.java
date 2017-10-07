package PhoneIXL;

import java.util.ArrayList;

import java.util.List;

public class combinationSum {
	public List<List<Integer>> combine(int target , int[] coins){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		helper(result , temp , coins , target , 0);
		return result;
	}
	private void helper(List<List<Integer>> result , List<Integer> temp , int[] coins , int target , int index){
		if(target == 0){
			result.add(new ArrayList<Integer>(temp));
		}else if(target > 0){
			for(int i = index ; i < coins.length ; i++){
				temp.add(coins[i]);
				helper(result , temp , coins , target - coins[i] , i);
				temp.remove(temp.size() - 1);
			}
		}
	}
	
}
