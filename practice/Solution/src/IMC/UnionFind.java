package IMC;

public class UnionFind {
	public int solution(int[][] A){
		if(A == null || A.length == 0 || A[0].length == 0){
			return 0;
		}
		Found uf = new Found(A);
		int m = A.length;
		int n = A[0].length;
		for(int i = 0 ; i < m ; i++){
			for(int j = 0 ;j < n ; j++){
				int p = i * n + j;
				int q;
				if(i > 0 && A[i - 1][j] == A[i][j]){
					q = p - n;
					uf.union(p , q);
				}
				if(i < m - 1 && A[i + 1][j] == A[i][j]){
					q = p + n;
					uf.union(p , q);
				}
				if(j > 0 && A[i][j - 1] == A[i][j]){
					q = p - 1;
					uf.union(p , q);
				}
				if(j < n - 1 && A[i][j + 1] == A[i][j]){
					q = p + 1;
					uf.union(p , q);
				}
			}
		}
		return uf.count;
	}
	class Found{
		public int count;
		public int[] parent;
		public Found(int[][] grid){
			int m = grid.length;
			int n = grid[0].length;
			for(int i = 0 ;i < m ; i++){
				for(int j = 0 ; j < n ; j++){
					count++;
				}
			}
			parent = new int[m * n];
			for(int i = 0 ; i < m * n ; i++){
				parent[i] = i;
			}
		}
		public int find(int p){
			while(p != parent[p]){
				parent[p] = parent[parent[p]];
				p = parent[p];
			}
			return p;
		}
		public void union(int p , int q){
			int rootP = find(p);
			int rootQ = find(q);
			if(rootP == rootQ) return;
			parent[rootP] = rootQ;
			count--;
		}
	}
}
