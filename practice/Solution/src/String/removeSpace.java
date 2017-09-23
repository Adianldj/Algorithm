package String;

public class removeSpace {
	public String removeSpaces(String input){
		if(input == null || input.isEmpty()){
			return input;
		}
		char[] array = input.toCharArray();
		int end = 0;
		for(int i = 0 ; i < input.length() ; i++){
			 while( array[i] == ' ' && (i == 0 || array[i - 1] == ' ')){
				 continue;
			 }
			 array[end++] = array[i];
		}
		if(end > 0 && array[end - 1] == ' '){
			return new String(array , 0 , end - 1);
		}
		return new String(array , 0 , end);
	}

}
