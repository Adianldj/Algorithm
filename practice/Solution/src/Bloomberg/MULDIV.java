package Bloomberg;

import java.util.HashSet;
import java.util.Set;

public class MULDIV {
		int result = Integer.MAX_VALUE;
		public int minWays(int target){
			if(target == 1  || target <= 0){
				return -1;
			}
			int num = 0;
			Set<Integer> set = new HashSet<Integer>();
			dfs(target , 1 , num , set);
			return result;
		}
		private void dfs(int target , int cur , int num , Set<Integer> set){
			if(!set.add(cur)){
				return;
			}
			if(cur == target){
				result = Math.min(result, num);
				return;
			}
			if(cur < target){
				dfs(target , cur * 3  , num + 1 , set);
			}
			if(cur > target){
				dfs(target , cur / 2 ,  num + 1 , set);
			}
		}
		public void main(String[] args){
			MULDIV result = new MULDIV();
			System.out.println(result.minWays(9));
		}
		
	
}
