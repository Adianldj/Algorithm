package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class AllSubset2 {
	public List<String> subset(String set){
		List<String> result = new ArrayList<String>();
		if(set == null){
			return result;
		}
		StringBuilder sb = new StringBuilder();
		char[] array = set.toCharArray();
		Arrays.sort(array);
		DFS(result , array , 0 , sb);
		return result;
	}
	private void DFS(List<String> result , char[] array , int index , StringBuilder sb){
		if(index == array.length){
			result.add(sb.toString());
			return;
		}
		sb.append(array[index]);
		DFS(result , array , index + 1 , sb);
		sb.deleteCharAt(sb.length() - 1);
		while(index < array.length - 1 && array[index] == array[index + 1]){
			index++;
		}
		DFS(result , array , index + 1 , sb);
		
	}
	public static void main(String[] args) {
		AllSubset2 solution = new AllSubset2();
		String input = "abab";
		List<String> result;
		result = solution.subset(input);
		for(int i = 0 ; i < result.size() ; i++){
			System.out.println(result.get(i));
		}
		
	}
}
