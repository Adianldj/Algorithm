package practice6;



public class longestPalindrome {
	public String longest(String s){
		String result = "";
		if(s == null || s.length() <= 1){
			return s;
		}
		int length = 0;
		for(int i = 0 ; i < s.length() ; i++){
			if(isPalin(s , i , i -length)){
				result = s.substring(i - length , i + 1);
				length = length + 1;
			}
			else if(isPalin(s , i , i - length - 1)){
				result = s.substring(i - length - 1, i + 1);
				length = length + 2;
			}
		}
		return result;
	}
	private boolean isPalin(String s , int right , int left){
		char[] array = s.toCharArray();
		if(left > right || left < 0){
			return false;
		}
		while(left <= right){
			if(array[left] != array[right]){
				return false;
			}
			right--;
			left++;
		}
		return true;
	}
	public static void main(String[] args) {
		longestPalindrome solution = new longestPalindrome();

		String result;
		String input = "bbctyytcbb";
		result = solution.longest(input);
		System.out.println(result);

	

	}
}
