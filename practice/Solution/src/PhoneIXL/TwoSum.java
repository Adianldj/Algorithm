package PhoneIXL;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums , int target){
		int[] result = new int[]{-1 , -1};
		if(nums == null || nums.length <= 1){
			return result;
		}
		Map<Integer , Integer> map = new HashMap<Integer , Integer>();
		for(int i = 0 ; i < nums.length ; i++){
			if(map.containsKey(target - nums[i])){
				result[0] = map.get(target - nums[i]);
				result[1] = i;
				return result;
			}
			if(!map.containsKey(nums[i])){
				map.put(nums[i], i);
			}
		}
		return result;
	}
}
