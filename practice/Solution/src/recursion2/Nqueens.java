package recursion2;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {
	public List<List<Integer>> nqueens(int n){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(n == 0){
			return result;
		}
		List<Integer> cur = new ArrayList<Integer>();
		helper(result , cur , n);
		return result;
	}
	private void helper(List<List<Integer>> result , List<Integer> cur , int n){
		if(cur.size() == n){
			result.add(new ArrayList<Integer>(cur));
			return;
		}
		for(int i = 0 ; i < n ; i++){
			if(valid(cur , i)){
				cur.add(i);
				helper(result , cur , n);
				cur.remove(cur.size() - 1);
			}
		}
	}
	private boolean valid(List<Integer> cur , int m){
		int size = cur.size();
		for(int i = 0 ; i < size ; i++){
			if(cur.get(i) == m || Math.abs(cur.get(i) - m) == cur.size() - i){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Nqueens solution = new Nqueens();
		List<List<Integer>> result;
       
		result = solution.nqueens(10);
		for(int i = 0 ; i < result.size() ; i++){
			for(int j = 0 ; j < result.get(i).size() ; j++)
		      System.out.println(result.get(i).get(j));
		}
	}
}
