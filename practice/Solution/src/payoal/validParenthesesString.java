package payoal;

public class validParenthesesString {
	 public boolean checkValidString(String s) {
	        if(s == null || s.length() == 0){
	            return true;
	        }
	        return check(s , 0 , 0);
	    }
	    private boolean check(String s , int index , int count){
	       
	        if(count < 0){
	            return false;
	        }
	        for(int i = index ; i < s.length() ; i++){
	            char c = s.charAt(i);
	            if( c == '('){
	                count++;
	            } else if (c == ')'){
	                if(count <= 0){
	                    return false;
	                }
	                count--;
	            } else {
	                return check(s , i + 1 , count + 1) || check(s , i + 1 , count - 1) || check(s , i  + 1 , count);
	            }
	        }
	        return count == 0;
	    }
}
