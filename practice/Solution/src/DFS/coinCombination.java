package DFS;

import java.util.ArrayList;
import java.util.List;

public class coinCombination {
	public List<List<Integer>> combine(int target , int[] coins){
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
	public static void main(String[] args) {
		coinCombination solution = new coinCombination();
		List<List<Integer>> result;
		int[] array = new int[]{25 , 10 , 5 , 1};
		int target = 30;
		

		result = solution.combine(target , array);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).toString());

		}
		

	}
}
