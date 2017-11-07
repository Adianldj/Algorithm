package Microsoft;

public class countPalindrome {
	public int countNumpalindromes(String s){
		int count = 0;
		for(int i = 0 ; i < s.length() ; i++){
			for(int j = s.length() - 1 ; j >= i ; j--){
				if(s.charAt(i) == s.charAt(j)){
					if(isPalindrome(s , i , j)){
						count++;
					}
				}
			}
		}
		return count;
	}
	private boolean isPalindrome(String s , int i , int j){
		if(i == j){
			return true;
		}
		while(i < j){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return false;
	}
}
