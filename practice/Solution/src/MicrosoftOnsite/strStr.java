package MicrosoftOnsite;

public class strStr {
	public int strstr(String large , String small){
		if(large == null || large.length() < small.length()){
			return -1;
		}
		int j;
		for(int i = 0 ; i <= large.length() - small.length() ; i++){
			for(j = 0 ; j < small.length() ; j++){
				if(small.charAt(j) != large.charAt(i + j)){
					break;
				}
			}
			if(j == small.length()){
				return i;
			}
		}
		return -1;
	}
}
