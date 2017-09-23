package BFS;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class kthMatrix {
	public int kthSmall(int[][] matrix, int k) {
		int row = matrix.length;
		int col = matrix[0].length;
		PriorityQueue<cell> minHeap = new PriorityQueue<cell>(k,
				new MyComparator());
		minHeap.offer(new cell(0, 0, matrix[0][0]));
		// boolean[][] visited = new boolean[row][col];
		// visited[0][0] = true;
		Set<cell> set = new HashSet<>();
		set.add(new cell(0, 0, matrix[0][0]));
		for (int i = 0; i < k - 1; i++) {
			cell cur = minHeap.poll();
			if (cur.row + 1 < row
					&& set.add (new cell(cur.row + 1, cur.col,
							matrix[cur.row + 1][cur.col]))) {
				minHeap.offer(new cell(cur.row + 1, cur.col,
						matrix[cur.row + 1][cur.col]));
			}
			if (cur.col + 1 < col
					&& set.add(new cell(cur.row, cur.col + 1,
							matrix[cur.row][cur.col + 1]))) {
				minHeap.offer(new cell(cur.row, cur.col + 1,
						matrix[cur.row][cur.col + 1]));

			}
		}
		return minHeap.peek().val;
	}

	static class cell {
		int row;
		int col;
		int val;

		cell(int row, int col, int val) {
			this.row = row;
			this.col = col;
			this.val = val;

		}
	}

	public static class MyComparator implements Comparator<cell> {
		@Override
		public int compare(cell o1, cell o2) {
			if (o1.val == o2.val) {
				return 0;
			}
			return o1.val < o2.val ? -1 : 1;
		}
	}

	public static void main(String[] args) {
		kthMatrix solution = new kthMatrix();
		int target = 9;
		int result;

		int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 2, 4, 8, 9 },
				{ 3, 5, 11, 15 }, { 6, 8, 13, 18 } };
		result = solution.kthSmall(matrix, target);
		System.out.println(result);

	}

}
