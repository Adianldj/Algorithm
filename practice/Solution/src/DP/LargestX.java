package DP;

public class LargestX {
	public int largestX(int[][] matrix) {
		if (matrix == null || matrix.length <= 0 || matrix[0].length == 0) {
			return 0;
		}
		int n = matrix.length;
		int m = matrix[0].length;

		int[][] leftup = leftup(matrix, n, m);
		int[][] rightdown = rightdown(matrix, n, m);

		return merge(leftup, rightdown, n, m);
	}

	private int[][] leftup(int[][] matrix, int n, int m) {
		int[][] left = new int[n][m];
		int[][] up = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == 1) {
					left[i][j] = getNumber(left, i - 1, j - 1, n, m) + 1;
					up[i][j] = getNumber(up, i - 1, j + 1, n, m) + 1;
				}
			}
		}
		merge(left, up, n, m);
		return left;
	}

	private int[][] rightdown(int[][] matrix, int n, int m) {
		int[][] right = new int[n][m];
		int[][] down = new int[n][m];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				if (matrix[i][j] == 1) {

					right[i][j] = getNumber(right, i + 1, j + 1, n, m) + 1;
					down[i][j] = getNumber(down, i + 1, j - 1, n, m) + 1;
				}
			}
		}

		merge(right, down, n, m);

		return right;
	}

	private int merge(int[][] left, int[][] right, int n, int m) {
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				left[i][j] = Math.min(left[i][j], right[i][j]);
				max = Math.max(left[i][j], max);
			}
		}
		return max;
	}

	private int getNumber(int[][] matrix, int i, int j, int n, int m) {
		if (i < 0 || j < 0 || i >= n || j >= m) {
			return 0;
		}
		return matrix[i][j];
	}
}
