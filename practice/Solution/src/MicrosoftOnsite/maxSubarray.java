package MicrosoftOnsite;

public class maxSubarray {
	public int largestSum(int[] array) {
		if(array == null || array.length == 0){
		  return 0;
		}
		if(array.length <= 1){
		  return array[0];
		}
		int cur = array[0] , max = array[0];
		for(int i = 1 ; i < array.length ; i++){
		  if(cur < 0){
		    cur = array[i];
		  } else {
		    cur = cur + array[i];
		  }
		  max = Math.max(max , cur);
		}
		return max;
}
}
