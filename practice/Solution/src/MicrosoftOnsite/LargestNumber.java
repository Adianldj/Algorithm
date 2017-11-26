package MicrosoftOnsite;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	public String largestNumber(int[] nums) {
	       if(nums == null || nums.length == 0){
	           return "";
	       }
	        String[] result = new String[nums.length];
	        for(int i = 0 ; i < nums.length ; i++){
	            result[i] = nums[i] + "";
	        }
	        Arrays.sort(result , new Comparator<String>(){
	           @Override
	            public int compare(String s1 , String s2){
	                String i = s1 + s2;
	                String j = s2 + s1;
	                return i.compareTo(j);
	            }
	        });
	        if(result[result.length - 1].charAt(0) == '0') {
	            return "0";
	        }
	        StringBuilder sb = new StringBuilder();
	        for(int i = result.length - 1; i >=  0; i--){
	            sb.append(result[i]);
	        }
	        return sb.toString();
	    }
}
