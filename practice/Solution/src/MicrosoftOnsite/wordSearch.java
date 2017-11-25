package MicrosoftOnsite;

public class wordSearch {
	 public boolean exist(char[][] board, String word) {
	        for(int i = 0 ; i < board.length ; i++){
	            for(int j = 0 ; j < board[0].length ; j++){
	                if(exit(board , i , j , 0 , word)){
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	    private boolean exit(char[][] board , int i , int j , int index , String word){
	        if(index == word.length()){
	            return true;
	        }
	        if(i < 0 || i == board.length || j < 0 || j == board[0].length){
	            return false;
	        }
	        if(board[i][j] == word.charAt(index)){
	            char temp = board[i][j];
	            board[i][j] = '*';
	            boolean result = exit(board , i + 1 , j , index + 1 , word) || exit(board ,i - 1 , j , index + 1 , word) || exit(board , i , j + 1 , index + 1 , word) || exit(board , i , j - 1 , index + 1 , word);
	            board[i][j] = temp;
	            return result;
	        }
	        return false;
	    }
}

