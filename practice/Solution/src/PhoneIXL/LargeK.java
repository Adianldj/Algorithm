package PhoneIXL;

import java.util.PriorityQueue;

public class LargeK {
	public int findKthLargest(int[] nums ,int k){
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for(int n : nums){
			minHeap.offer(n);
			if(minHeap.size() > k){
				minHeap.poll();
			}
		}
		return minHeap.poll();
	}
}
//Time complexity:o(nlogk) Space:O(k)
//also quicksort average o(n), worst o(n^2)
//public int findKthLargest(int[] nums, int k) {
//	if (k < 1 || nums == null) {
//		return 0;
//	}
// 
//	return getKth(nums.length - k +1, nums, 0, nums.length - 1);
//}
// 
//public int getKth(int k, int[] nums, int start, int end) {
// 
//	int pivot = nums[end];
// 
//	int left = start;
//	int right = end;
// 
//	while (true) {
// 
//		while (nums[left] < pivot && left < right) {
//			left++;
//		}
// 
//		while (nums[right] >= pivot && right > left) {
//			right--;
//		}
// 
//		if (left == right) {
//			break;
//		}
// 
//		swap(nums, left, right);
//	}
// 
//	swap(nums, left, end);
// 
//	if (k == left + 1) {
//		return pivot;
//	} else if (k < left + 1) {
//		return getKth(k, nums, start, left - 1);
//	} else {
//		return getKth(k, nums, left + 1, end);
//	}
//}
// 
//public void swap(int[] nums, int n1, int n2) {
//	int tmp = nums[n1];
//	nums[n1] = nums[n2];
//	nums[n2] = tmp;
//}