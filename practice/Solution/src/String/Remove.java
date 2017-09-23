package String;

public class Remove {
		public String deDup(String input){
			if(input == null || input.length() <= 1){
				return input;
			}
			char[] array = input.toCharArray();
			int slow = 1;
			int fast = 0;
			while(fast < input.length()){
				if(array[fast] == array[slow - 1]){
					fast++;
				}else{
					array[slow++] = array[fast++]; 
				}
			}
			return new String(array , 0 , slow);
		}
}
