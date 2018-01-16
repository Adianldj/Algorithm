package Bloomberg;

public class xiaoxiaole {
	public String deDup(String input) {
	  
//	  if(input == null || input.length() <= 1){
//	    return input;
//	  }
//	  char[] array = input.toCharArray();
//	  int end = 0;
//	  for(int i = 1 ; i < input.length() ; i++){
//	    if(end == -1 || array[end] != array[i]){
//	      array[++end] = array[i];
//	    } else {
//	      end--;
//	      while(i < array.length - 1 && array[i] == array[i + 1]){
//	        i++;
//	      }
//	    }
//	  }
//	  return new String(array , 0 , end + 1);
		if(input == null || input.length() <= 2){
			return input;
		}
		char[] array = input.toCharArray();
		int end = 1;
		for(int i = 2 ; i < array.length ; i++){
			if(end <= 0 || array[end] != array[i] || array[i] != array[end - 1]){
				array[++end] = array[i];
			} else {
				end = end - 2;
				while(i < array.length - 1 && array[i] == array[i + 1]){
					i++;
				}
			}
		}
		return new String(array , 0 , end + 1);
	  }
	
	public void main(String[] args){
		xiaoxiaole result = new xiaoxiaole();
		String input1 = "12221";
		String input2 = "1222113331";
		String result1 = result.deDup(input1);
		String result2 = result.deDup(input2);
		System.out.println(result1);
		System.out.println(result2);
	}
}
