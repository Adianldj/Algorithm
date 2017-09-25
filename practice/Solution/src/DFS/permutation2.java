package DFS;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class permutation2 {
	char[] array = new char[]{'(' , ')' , '[' , ']' , '{' , '}'};
	public List<String> permute2(int l , int m , int n){
		int[] remain = new int[]{l , l , m , m , n , n};
		Deque<Character> stack = new LinkedList<Character>();
		StringBuilder sb = new StringBuilder();
		List<String> result = new ArrayList<String>();
		int sum = 2* l + 2 * m + 2 * n;
		helper(result , sb , remain , stack , sum);
		return result;
		
	}
	private void helper(List<String> result , StringBuilder sb , int[] remain , Deque<Character> stack , int sum){
		if(sb.length() == sum){
			result.add(sb.toString());
			return;
		}
		for(int i = 0 ; i < remain.length ; i++){
			if(i % 2 == 0){
				if(remain[i] > 0){
					sb.append(array[i]);
					remain[i]--;
					stack.offerFirst(array[i]);
					helper(result , sb , remain , stack , sum);
					remain[i]++;
					sb.deleteCharAt(sb.length() - 1);
					stack.pollFirst();
					
				}
			}else{
				if(!stack.isEmpty() && remain[i] > 0 && array[i - 1] == stack.peekFirst()){
					sb.append(array[i]);
					remain[i]--;
					stack.pollFirst();
					helper(result , sb , remain , stack , sum);
					sb.deleteCharAt(sb.length() - 1);
					remain[i]++;
					stack.offerFirst(array[i - 1]);
				}
			}
		}
	}
}
