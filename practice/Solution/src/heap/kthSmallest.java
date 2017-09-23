package heap;

import java.util.Comparator;
import java.util.PriorityQueue;


public class kthSmallest {
	public int[] kth(int[] array, int k) {
 //MAX HEAP
		if (array == null || array.length == 0 || k == 0) {
			return new int[0];
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k,
				new MyComparator());

		for (int i = 0; i < k; i++) {
			maxHeap.offer(array[i]);
		}
		for (int i = k; i < array.length; i++) {
			if (array[i] < maxHeap.peek()) {
				maxHeap.poll();
				maxHeap.offer(array[i]);
			}
		}
		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = maxHeap.poll();
		}
		return result;
////MIN HEAP
//		if(array == null || array.length == 0){
//			return new int[0];
//		}
//		int n = array.length;
//		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(n);
//		for(int i = 0 ; i < array.length ; i++){
//			minHeap.offer(array[i]);
//		}
//		int[] result = new int[k];
//		for(int i = 0 ; i < k ; i++){
//			result[i] = minHeap.poll();
//		}
//		return result;
//		
	}

	private static class MyComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			if (o1.equals(o2)) {
				return 0;
			}
			return o1 > o2 ? -1 : 1;
		}
	}

	public static void main(String[] args) {
		kthSmallest solution = new kthSmallest();
		int target = 2;
		int[] result;
//
		int[] array = null;
//		result = solution.kth(array, target);
//		System.out.println(result);
//
//		array = new int[0];
//		result = solution.kth(array, target);
//		System.out.println(result);

		array = new int[] { 0, 1, 2, 4, 5, 8 };
		result = solution.kth(array, target);
		for(int i = 0 ; i < result.length ; i++){
		System.out.println(result[i]);
		}
	}

}
