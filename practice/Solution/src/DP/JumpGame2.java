package DP;

public class JumpGame2 {
	public int Jump(int[] array){
		int n = array.length;
		int[] result = new int[n];
		result[0] = 0;
		for(int i = 1 ; i < array.length ; i++){
			result[i] = -1;
			for(int j = i - 1 ; j >= 0 ; j--){
				if(array[j] + j >= i && result[j] != -1){
					if(result[i] == -1 || result[i] > result[j] + 1){
						result[i] = result[j] + 1;
					}
				}
			}
		}
		return result[n - 1];
	
}
}
