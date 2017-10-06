package IMC;

public class Nodigit {
	public int solution(String s){
		if(s == null || s.length() == 0){
			return -1;
		}
		int[] hash = new int[128];
		int j = 0;
		int max = 0;
		for(int i = 0 ; i< s.length() ; i++){
			while(j < s.length()){
				if(!check(hash)){
					break;
				}
				hash[s.charAt(j++)]++;
			}
			if(check(hash) && max < j - i){
				max = j - i;
			}
			hash[s.charAt(i)]--;
		}
		return max == 0 ? -1 : max;
	}
	private boolean check(int[] hash){
		boolean Upper = false;
		boolean isNum = false;
		for(int i = 0 ; i < hash.length ; i++){
			if(isNum) return false;
			if(hash[i] > 0){
				if(i >= 65 && i <= 90) Upper = true;
				if(i >= 48 && i <= 57) isNum = true;
			}
		}
		return Upper && !isNum;
	}
}
