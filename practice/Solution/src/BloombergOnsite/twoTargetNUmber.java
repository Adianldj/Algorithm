package BloombergOnsite;

import java.util.HashMap;
import java.util.Map;

public class twoTargetNUmber {
	public void findpair(int[] array1 , int[] array2 , int target){
		Map<Integer , Integer> map = new HashMap<Integer , Integer>();
		for(int i =  0 ; i < array1.length ; i++){
			map.put(array1[i], 0);
		}
		for(int j = 0 ; j < array2.length ; j++){
			if(map.containsKey(target - array2[j])){
				System.out.println(target - array2[j] + " " + array2[j]);
			}
		}
	}
}
