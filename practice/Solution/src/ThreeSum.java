import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreeSum {
	public List<List<Integer>> three(int[] array , int target){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(array == null){
			return result;
		}
		Arrays.sort(array);
		for(int i = 0 ; i < array.length - 2; i++){
			if(i > 0 && array[i] == array[i - 1]){
				continue;
			}
			int j = i + 1;
			int k = array.length - 1;
			while(j < k){
				if(array[j] + array[k] + array[i] == target){
					result.add(Arrays.asList(array[i] , array[j] , array[k]));
					while(j < k && array[j + 1] == array[j]){
						j++;
					}
					while(j < k && array[k - 1] == array[k]){
						k--;
					}
					j++;
					k--;
				}else if(array[j] + array[i] + array[k] < target){
					j++;
				}else{
					k--;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		ThreeSum solution = new ThreeSum();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int[] array = {1 , 1 , 1 , 1 , 1};
		result= solution.three(array , 3);
		for(List<Integer> n : result){
			System.out.println(n.toString());
		}


	}
}
