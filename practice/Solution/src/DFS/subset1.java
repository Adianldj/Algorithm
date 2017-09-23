package DFS;

import java.util.ArrayList;
import java.util.List;

public class subset1 {
		public List<String> allSubset(String set){
			List<String> result = new ArrayList<String>();
			if(set == null){
				return result;
			}
			StringBuilder sb = new StringBuilder();
			char[] array = set.toCharArray();
			dfs(result , 0 , array , sb);
			return result;
		}
		private void dfs(List<String> result , int index , char[] array, StringBuilder sb){
			if(index == array.length){
				result.add(sb.toString());
				return;
			}
			dfs(result , index + 1 , array , sb);
			dfs(result , index + 1 , array , sb.append(array[index]));
			sb.deleteCharAt(sb.length() - 1);
		}
		public static void main(String[] args) {
			subset1 solution = new subset1();
			List<String> result;

			String set = null;
			result = solution.allSubset(set);
			for (int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));

			}
			set = "abc";
			result = solution.allSubset(set);
			for (int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));

			}

		}
}
