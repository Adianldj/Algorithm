package String;

public class LongestCommonSubstring {
	public String common(String s , String t){
		int n = s.length();
		int m = t.length();
		int start = 0 ;
		int longest = 0;
		int[][] matrix = new int[n][m];
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < m ; j++){
				if(s.charAt(i) == t.charAt(j)){
					if(i == 0 || j == 0){
						matrix[i][j] = 1;
					}else{
						matrix[i][j] = matrix[i - 1][j - 1] + 1;
					}
					if(matrix[i][j] > longest){
						longest = matrix[i][j];
						start = i - longest + 1;
					}
					
				}
			}
		}
		return s.substring(start, start + longest);
	}
}
