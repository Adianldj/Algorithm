package IXL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mode {
	public int getMin(int[] arr){
		if(arr == null || arr.length == 0){
			return 0;
		}
		int max = 0;
		Map<Integer , Integer> mapFre = new HashMap<>();
		Map<Integer , Integer> mapStart = new HashMap<>();
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0 ; i < arr.length ; i++){
			if(!mapStart.containsKey(arr[i])){
				mapStart.put(arr[i] , i);
				mapFre.put(arr[i] , 1);
			}else{
				mapFre.put(arr[i], mapFre.get(arr[i]) + 1);
			}
			max = Math.max(max, mapFre.get(arr[i]));
		}
		for(Map.Entry<Integer, Integer> entry : mapFre.entrySet()){
			if(entry.getValue() == max){
				set.add(entry.getKey());
			}
		}
		
		int length = Integer.MAX_VALUE;
		for(int i = arr.length - 1 ; i >= 0 ; i--){
			if(set.contains(arr[i])){
				length = Math.min(length, i - mapStart.get(arr[i]) + 1);
				set.remove(arr[i]);
			}
		}
		return length;
	}
	public static void main(String[] args) {
		Mode solution = new Mode();
       
        int result;
        int[] array = new int[]{1 , 4 ,3 , 3 , 4 , 2 , 1};
        result = solution.getMin(array);
        System.out.println(result);
      

        

	}
	
	
	
}
