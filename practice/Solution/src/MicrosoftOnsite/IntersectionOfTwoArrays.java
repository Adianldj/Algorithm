package MicrosoftOnsite;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	 public int[] intersection(int[] nums1, int[] nums2) {
	       Set<Integer> set = new HashSet<Integer>();
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        int i = 0 , j = 0;
	        while(i < nums1.length && j < nums2.length){
	            if(nums1[i] < nums2[j]){
	                i++;
	            } else if(nums1[i] > nums2[j]) {
	                j++;
	            } else {
	                set.add(nums1[i]);
	                i++;
	                j++;
	            }
	        }
	        i = 0;
	        int[] result = new int[set.size()];
	        for(Integer n : set){
	            result[i] = n;
	            i++;
	        }
	        return result;
	    }
}
