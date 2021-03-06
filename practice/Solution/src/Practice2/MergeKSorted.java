package Practice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSorted {
	public int[] merge(int[][] arrayOfArrays) {
		if (arrayOfArrays == null) {
			return null;
		}

		int k = arrayOfArrays.length;
		PriorityQueue<element> minHeap = new PriorityQueue<element>(k,
				new MyComparator());
		int length = 0;
		for (int i = 0; i < arrayOfArrays.length; i++) {
			length = length + arrayOfArrays[i].length;
			if (arrayOfArrays[i].length != 0) {
				minHeap.offer(new element(i, 0, arrayOfArrays[i][0]));
			}
		}
		int[] result = new int[length];
		int index = 0;
		while (!minHeap.isEmpty()) {
			element e = minHeap.poll();
			result[index] = e.value;
			index++;
			if (e.y + 1 < arrayOfArrays[e.x].length) {
				minHeap.offer(new element(e.x, e.y + 1,
						arrayOfArrays[e.x][e.y + 1]));
			}
		}
		return result;

	}

	static class element {
		int x;
		int y;
		int value;

		public element(int x, int y, int value) {
			this.x = x;
			this.y = y;
			this.value = value;
		}
	}

	static class MyComparator implements Comparator<element> {
		@Override
		public int compare(element e1, element e2) {
			if (e1.value == e2.value) {
				return 0;
			}
			return e1.value < e2.value ? -1 : 1;
		}
	}

	public static void main(String[] args) {
		MergeKSorted solution = new MergeKSorted();
		int[] result;
		int[][] arrayOfArrays = new int[][] { {}, { 1, 5, 7 }, { 4 },
				{ 2, 3, 5, 11 }, { 2, 4, 4, 6, 8 } };
		result = solution.merge(arrayOfArrays);
		System.out.println(Arrays.toString(result));

	}
}
