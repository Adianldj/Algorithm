package BFS;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class KthSmallest357 {
	public long kth(int k){
		PriorityQueue<Long> minHeap = new PriorityQueue<Long>();
		Set<Long> set = new HashSet<Long>();
		minHeap.offer(3*5*7L);
		set.add(3*5*7L);
		while(k > 1){
			long cur = minHeap.poll();
			if(set.add(cur * 3)){
				minHeap.offer(cur * 3);
			}
			if(set.add(cur * 5)){
				minHeap.offer(cur * 5);
			}
			if(set.add(cur * 7)){
				minHeap.offer(cur * 7);
			}
			k--;
		}
		return minHeap.peek();
		
	}
}
