import java.util.HashMap;
import java.util.Map;


public class TwoSum {
	public boolean twoSum(int[] array , int target){
		if(array == null){
			return false;
		}
		Map<Integer , Integer> map = new HashMap<Integer , Integer>();
		for(int i = 0 ; i < array.length ; i++){
			if(map.containsKey(target - array[i])){
				return true;
			}
			map.put(array[i] , i);
		}
		return false;
	}
}
