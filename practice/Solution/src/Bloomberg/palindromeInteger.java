package Bloomberg;

public class palindromeInteger {
	public boolean isPalindrome(int x){
		if(x % 10 == 0 && x != 0){
			return false;
		}
		int result = 0;
		while(result < x){
			result = result * 10 + x % 10;
			x = x/ 10;
		}
		if(result == x || result / 10 == x){
			return true;
		}
		return false;
	}
}
