package BloombergOnsite;

public class removeCharacter {
	 public String deDup(String input) {
	if(input == null || input.length() <= 1){
	    return input;
	  }
	  int end = 0;
	  char[] array = input.toCharArray();
	  for(int i = 1 ; i < array.length ; i++){
	    if(end == -1 || array[end] != array[i]){
	      array[++end] = array[i];
	    } else {
	      end--;
	      while(i < array.length - 1 && array[i] == array[i + 1]){
	        i++;
	      }
	    }
	  }
	  return new String(array , 0 , end + 1);
	 }
}
