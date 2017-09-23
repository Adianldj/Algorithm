package String;

public class RightShift {
	public String rightshift(String input , int n){
		if(input.length() <= 1){
			return input;
		}
		n = n % input.length();
		char[] array = input.toCharArray();
		reverse(array , array.length - n  , array.length - 1);
		reverse(array , 0 , array.length - n - 1);
		reverse(array , 0 , array.length - 1);
		return new String(array);
	}
	private void reverse(char[] array , int left , int right){
		while(left <= right){
			char temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}
	public static void main(String[] args) {
		RightShift solution = new RightShift();
		String input = "yahoo";
		int n = 7;
		String result;
		result = solution.rightshift(input , n);
		System.out.println(result);
		
	}
}
