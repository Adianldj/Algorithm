package BloombergOnsite;

public class removeCharacter1 {
	public String deDup(String input) {
	  
			
			if(input == null || input.length() <= 1){
			  return input;
			}
			char[] array = input.toCharArray();
			int slow = 1;
			int fast = 0;
			while(fast < input.length()){
			  if(array[slow - 1] != array[fast]){
			    array[slow++] = array[fast++];
			  } else {
			    fast++;
			  }
			}
			return new String(array , 0 , slow);
	  } 
}
