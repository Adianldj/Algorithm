import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TwoSumPair {
	public List<List<Integer>> twoSum(int[] array , int target){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Map<Integer , List<Integer>> map = new HashMap<Integer , List<Integer>>();
		for(int i = 0 ; i < array.length ; i++){
			List<Integer> temp = map.get(target - array[i]);
			if(temp != null){
				for(int j : temp){
					result.add(Arrays.asList(j , i));
				}
			}
			if(!map.containsKey(array[i])){
				map.put(array[i], new ArrayList<Integer>());
			}
			map.get(array[i]).add(i);
		}
		return result;
	}
}
