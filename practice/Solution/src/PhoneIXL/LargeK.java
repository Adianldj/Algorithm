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
