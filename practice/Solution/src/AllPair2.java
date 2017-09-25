import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AllPair2 {
	public  List<List<Integer>> getAll(int[] array , int target){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(array == null){
			return result;
		}
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		while(left < right){
			if(left > 0 && array[left] == array[left - 1]){
				left++;
				continue;
			}
			if(array[left] + array[right] == target){
				result.add(Arrays.asList(array[left] , array[right]));
				left++;
				right--;
			}else if(array[left] + array[right] < target){
				left++;
			}else{
				right--;
			}
		}
		return result;
	}
}
