package MicrosoftOnsite;

public class MissingNumber {
	public int missingNumber(int[] nums) {
	      int res = nums.length;
	        for(int i = 0 ; i < nums.length ; i++){
	            res = res ^ nums[i];
	            res = res ^ i;
	                
	        }
	        return res;
	    }
}
