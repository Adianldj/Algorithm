package Bloomberg;

public class printDiagonal {
	void printMatrixDiagonal(int[][] matrix , int n){
		int i = 0 , j = 0;
		boolean up = true;
		for(int k = 0 ; k < n * n ;){
			if(up){
				for(; i >= 0 && j <= n - 1 ; i-- , j++){
					System.out.println(matrix[i][j]);
	                k++;	
				}
				if(i < 0 && j <= n - 1){
					i = 0;
				}
				if(j == n){
					i =  i + 2;
					j = j -1;
				}
			} else {
				for(; j >= 0 && i < n ; i++ , j--){
					System.out.println(matrix[i][j]);
					k++;
				}
				if(j < 0 && i <= n - 1){
					j = n;
				}
				if(i == n){
					j = j + 2;
					i--;
				}
			}
			up = !up;
		}
	}
	public int main()
	{
	    int[][] matrix = {{1, 2, 3},
	        {4, 5, 6},
	        {7, 8, 9}
	    };
	 
	    int n = 3;
	    printMatrixDiagonal(matrix, n);
	    return 0;
	}
}
