package BloombergOnsite;

public class findPeak {
	public int findpeak(int[] nums){
		if(nums == null || nums.length == 0){
			return -1;
		}
		return find(nums , 0 , nums.length - 1);
	}
	private int find(int[] nums , int left , int right){
		if(left == right){
			return left;
		}
		if(left + 1 == right){
			return nums[left] > nums[right] ? left : right;
		}
		int mid = left + (right - left) / 2;
		if((mid <= 0 || nums[mid] > nums[mid - 1]) && (mid >= nums.length - 1 || nums[mid] > nums[mid + 1])){
			return mid;
		} else if(mid > 0 && nums[mid - 1] > nums[mid]){
			return  find(nums , left , mid - 1);
		} else {
			return find(nums , mid + 1 , right);
		}
	}
	
}
