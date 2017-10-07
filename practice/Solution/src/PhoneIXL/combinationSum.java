package PhoneIXL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {
	public List<List<Integer>> combine(int target , int[] coins){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		Arrays.sort(coins);
		helper(result , temp , coins , coins.length - 1 , target);
		return result;
	}
	private void helper(List<List<Integer>> result , List<Integer> temp , int[] coins , int index , int target){
		if(index == 0){
			if(target % coins[index] == 0){
				temp.add(target / coins[index]);
				result.add(new ArrayList<Integer>(temp));
				temp.remove(temp.size() - 1);
			}
			return;
		}
		int max = target / coins[index];
		for(int i = 0 ; i <= max ; i++){
			Add(temp , i , coins[index]);
			helper(result , temp, coins , index + 1 , target - i * coins[index]);
			Remove(temp ,i);
		}
	}
	private void Add(List<Integer> temp , int count , int number){
		for(int i = 0 ; i < count ; i++){
			temp.add(number);
		}
	}
	private void Remove(List<Integer> temp , int number){
		for(int i = 0 ; i < number ; i++){
			temp.remove(temp.size() - 1);
		}
	}
	
}
