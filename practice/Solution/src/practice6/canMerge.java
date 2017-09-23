package practice6;

public class canMerge {
		public boolean merge(String a , String b , String c){
			int al = a.length();
			int bl = b.length();
			int cl = c.length();
			if(al + bl != cl){
				return false;
			}
			boolean[][] matrix = new boolean[al + 1][ bl + 1];
			for(int i = 0 ; i < al ; i++){
				for(int j = 0 ; j < bl; j++){
					if(i == 0 && j == 0){
						matrix[i][j] = true;
					}
					if(i > 0 && a.charAt(i - 1) == c.charAt(i + j - 1)){
						matrix[i][j] = matrix[i - 1][j] | matrix[i][j];
					}
					if(j > 0 && b.charAt(j - 1) == c.charAt(i + j - 1)){
						matrix[i][j] = matrix[i][j - 1] | matrix[i][j];
					}
				}
			}
			return matrix[al][bl];
		}
}
