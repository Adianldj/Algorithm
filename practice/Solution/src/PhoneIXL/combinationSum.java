package PhoneIXL;

import java.util.ArrayList;

import java.util.List;

public class combinationSum {
//	public List<List<Integer>> combine(int target , int[] coins){
//		List<List<Integer>> result = new ArrayList<List<Integer>>();
//		List<Integer> temp = new ArrayList<Integer>();
//		helper(result , temp , coins , target , 0);
//		return result;
//	}
//	private void helper(List<List<Integer>> result , List<Integer> temp , int[] coins , int target , int index){
//		if(target == 0){
//			result.add(new ArrayList<Integer>(temp));
//		}else if(target > 0){
//			for(int i = index ; i < coins.length ; i++){
//				temp.add(coins[i]);
//				helper(result , temp , coins , target - coins[i] , i);
//				temp.remove(temp.size() - 1);
//			}
//		}
//	}
	public List<List<Integer>> combinations(int target, int[] coins) {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	List<Integer> cur = new ArrayList<Integer>();
	dfs(target , coins , cur , result , 0);
	return result;
	
}
private void dfs(int target , int[] coins , List<Integer> cur , List<List<Integer>> result , int index){
	if(index == coins.length - 1){
		if(target % coins[index] == 0){
			cur.add(target / coins[index]);
			result.add(new ArrayList<Integer>(cur));
			cur.remove(cur.size() - 1);
		}
		return;
	}
	int max = target / coins[index];
	for(int i = 0 ; i  <= max ; i++){
		cur.add(i);
		dfs(target - i * coins[index] , coins , cur , result , index + 1);
		cur.remove(cur.size() - 1);
	}
}
	
}
//time complexity:O(99^4)
