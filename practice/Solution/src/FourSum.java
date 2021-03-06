
import java.util.HashMap;

import java.util.Map;


public class FourSum {
	public boolean four(int[] array , int target){
		if(array == null){
			return false;
		}
		Map<Integer , pair> map = new HashMap<>();
		for(int j = 1 ; j < array.length ; j++){
			for(int i = 0 ; i < j ; i++){
				int sum = array[i] + array[j];
				if(map.containsKey(target - sum) && map.get(target - sum).right < i){
					return true;
				}
				if(!map.containsKey(sum)){
					map.put(sum , new pair(i , j));
				}
			}
		}
		return false;
	}
	static class pair{
		int left;
		int right;
		public pair(int left , int right){
			this.left = left;
			this.right = right;
		}
	}
}
