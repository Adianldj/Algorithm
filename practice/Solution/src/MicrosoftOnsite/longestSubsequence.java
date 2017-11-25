package MicrosoftOnsite;

import java.util.Arrays;

public class longestSubsequence {
	 public int lengthOfLIS(int[] nums) {
	        if(nums == null || nums.length == 0){
	            return 0;
	        }
	        int n = nums.length;
	        int[] dp = new int[n];
	        Arrays.fill(dp , 1);
	        int max = 1;
	        for(int i = 1 ; i < nums.length ; i++){
	            for(int j = 0 ; j < i ; j++){
	                if(nums[j] < nums[i]){
	                    dp[i] = Math.max(dp[i] , dp[j] + 1);
	                } else {
	                    continue;
	                }
	            }
	            max = Math.max(max , dp[i]);
	        }
	        return max;
	    }
}
