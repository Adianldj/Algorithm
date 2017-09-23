package String;

public class reverseString {
	public String reverse(String input){
		if(input == null || input.length() <= 1){
			return input;
		}
		int left = 0;
		int right = input.length() - 1;
		char[] array = input.toCharArray();
		while(left <= right){
			char temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
		return new String(array);
	}
	public static void main(String[] args) {
		reverseString solution = new reverseString();
		String input = "yahoo";
		String result;
		result = solution.reverse(input);
		System.out.println(result);
		
	}
}
