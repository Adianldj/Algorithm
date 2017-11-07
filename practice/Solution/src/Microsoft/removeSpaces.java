package Microsoft;

public class removeSpaces {
	public String removeSpace(String input){
		if(input == null || input .length() == 0){
			return input;
		}
		int end = 0;
		char[] array = new char[input.length()];
		for(int i = 0 ; i < input.length() ; i++){
			while(input.charAt(i) == ' ' && (i == 0 || input.charAt(i - 1) == ' ')){
				continue;
			}
			array[end++] = input.charAt(i);
		}
		if(end > 0 && array[end - 1] == ' '){
			return new String(array , 0 , end - 1);
		}
		return new String(array , 0 , end);
	}
}
