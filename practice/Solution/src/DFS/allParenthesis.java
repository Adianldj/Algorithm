package DFS;

import java.util.ArrayList;
import java.util.List;

public class allParenthesis {
	public List<String> allparent(int n){
		List<String> result = new ArrayList<String>();
		char[] array = new char[2 * n];
		dfs(result , n , n , 0 , array);
		return result;
		
	}
	private void dfs(List<String> result , int l , int r , int index , char[] array){
		if(l == 0 && r == 0){
			result.add(new String(array));
			return;
		}
		if(l > 0){
			array[index] = '(';
			dfs(result , l - 1 , r , index + 1 , array);
		}
		if(l < r){
			array[index] = ')';
			dfs(result , l , r - 1 , index + 1 , array);
		}
	}
	public static void main(String[] args) {
		allParenthesis solution = new allParenthesis();
		List<String> result;

		int n = 5;
		result = solution.allparent(n);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));

		}

	}
}
