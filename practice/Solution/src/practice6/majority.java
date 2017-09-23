package practice6;

public class majority {
	public int major(int[] array){
		if(array == null || array.length == 0){
			return -1;
		}
		if(array.length == 1){
			return array[0];
		}
		int major = array[0];
		int counter = 1;
		for(int i = 1 ; i < array.length ; i++){
			if(counter == 0){
				major = array[i];
				counter++;
			}else if(major == array[i]){
				counter++;
			}else{
				counter--;
			}
			
		}
		return major;
	}
}
