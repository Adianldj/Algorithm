package String;

public class Decompress {
	public String decompressString(String input){
		if(input.isEmpty()){
			return input;
		}
		char[] array = input.toCharArray();
		return decodeLong(array , decodeShort(array));
	}
	private int decodeShort(char[] array){
		int end = 0;
		for(int i = 0 ; i < array.length ; i = i + 2){
			int digit = getDigit(array[i + 1]);
			if(digit >= 0 && digit <= 2){
				for(int j = 0 ; j < digit ; j++){
					array[end++] = array[i];
				}
			}else{
				array[end++] = array[i];
				array[end++] = array[i + 1];
			}
		}
		return end;
	}
	private String decodeLong(char[] array , int length){
		int newlength = length;
		for(int i = 0 ; i < length ; i++){
			int digit = getDigit(array[i]);
			if(digit > 2 && digit <= 9){
				newlength = newlength + digit - 2;
			}
		}
		char[] result = new char[newlength];
		int end = newlength - 1;
		for(int i = length - 1 ; i >= 0 ; i--){
			int digit = getDigit(array[i]);
			if(digit > 2 && digit <= 9){
				i--;
				for(int j  = 0 ; j < digit ; j++){
					result[end--] = array[i];
				}
			}else{
				result[end--] = array[i];
			}
		}
		return new String(result);
	}
	private int getDigit(char digit){
		return digit - '0';
	}
	public static void main(String[] args) {
		Decompress solution = new Decompress();
		String input = "a3b2c0d2e1f3";
		String result;
		result = solution.decompressString(input);
	    System.out.println(result);
		

	}
}
