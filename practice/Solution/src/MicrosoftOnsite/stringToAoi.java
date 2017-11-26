package MicrosoftOnsite;

public class stringToAoi {
	 public int myAtoi(String str) {
	     int index = 0 , sum = 0, sign = 1;
	        if(str == null || str.length() == 0) {
	            return 0;
	        }
	        while(index < str.length() && str.charAt(index) == ' '){
	            index++;
	        }
	        if(str.charAt(index) == '+') {
	            sign = 1;
	            index++;
	        } else if(str.charAt(index) == '-') {
	            sign = -1;
	            index++;
	        }
	        while(index < str.length()){
	            int num = str.charAt(index) - '0';
	            if(num < 0 || num > 9){
	                break;
	            }
	            if(Integer.MAX_VALUE / 10 < sum || (Integer.MAX_VALUE / 10 == sum && num > Integer.MAX_VALUE % 10) ){
	                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	            }
	            sum = sum * 10 + num;
	            index++;
	        }
	        return sign == 1 ? sum : -sum;
	}
}
