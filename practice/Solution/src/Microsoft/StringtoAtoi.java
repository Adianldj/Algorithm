package Microsoft;

public class StringtoAtoi {
	public int myAtoi(String str){
		int index = 0, sign = 1 , sum = 0;
		if(str == null || str.length() == 0){
			return 0;
		}
		while(index < str.length() && str.charAt(index) == ' '){
			index++;
		}
		if(str.charAt(index) == '+'){
			sign = 1;
		}
		if(str.charAt(index) == '-'){
			sign = -1;
		}
		index++;
		while(index < str.length()){
			int digit = str.charAt(index) - '0';
			if(digit < 0 || digit > 9){
				break;
			}
			if(sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)){
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			sum = sum * 10 + digit;
			index++;
			
		}
		return sign == 1 ? sum : -sum;
	}
}
