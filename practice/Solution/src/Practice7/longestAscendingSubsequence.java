package Practice7;

public class longestAscendingSubsequence {
	public int longest(int[] array){
		if(array == null || array.length <= 0){
			return 0;
		}
		int[] longest = new int[array.length];
		int result = 1;
		longest[0] = 1;
		for(int i = 1 ; i < longest.length ; i++){
			longest[i] = 1;
			for(int j = 0 ; j < i ; j++){
				if(array[j] < array[i]){
					longest[i] = Math.max(longest[i] , longest[j] + 1);
				}
			}
			result = Math.max(result, longest[i]);
		}
		return result;
	}
}
