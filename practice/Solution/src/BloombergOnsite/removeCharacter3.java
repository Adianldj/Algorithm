package BloombergOnsite;

public class removeCharacter3 {
	public String deDup(String input){
		if(input == null || input.length() <= 2){
			return input;
		}
		int slow = 1;
		int fast = 2;
		char[] array = input.toCharArray();
		while(fast < input.length()){
			if(array[fast] != array[slow] || (array[fast] == array[slow] && array[slow - 1] != array[slow])){
				array[++slow] = array[fast++];
			} else {
				fast++;
			}
		}
		return new String(array , 0 , slow + 1);
	}
}
