package String;



public class reverseWords {
	public String reverse(String input){
		if(input == null || input.length() == 0){
			return input;
		}
		char[] array = input.toCharArray();
		int start = 0;
		reverse(array , 0 , array.length - 1);
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] != ' ' && (i== 0 || array[i - 1] == ' ')){
				start = i;
			}
			if(array[i] != ' ' && (i == array.length - 1 || array[i + 1] == ' ')){
				reverse(array , start , i);
			}
		}
		return new String(array);
	}
	private void reverse(char[] array , int left , int right){
		while(left < right){
			char temp = array[left];
			array[left] =array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}
	public static void main(String[] args) {
		reverseWords solution = new reverseWords();
		String input = "i love yahoo";
		String result;
		result = solution.reverse(input);
		System.out.println(result);
		
	}
}
