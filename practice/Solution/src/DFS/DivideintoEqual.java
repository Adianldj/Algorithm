package DFS;

public class DivideintoEqual {
	public boolean canDivide(int[] array){
		int n = array.length;
		int sum = 0;
		for(int i = 0 ; i < n ; i++){
			sum = sum + array[i];
		}
		if(sum % 2 != 0){
			return false;
		}
		return helper(array , n , sum / 2);
	}
	private boolean helper(int[] array , int n , int sum){
		if(sum == 0){
			return true;
		}
		if(n == 0 && sum != 0){
			return false;
		}
		if(array[n - 1] > sum){
			return helper(array , n - 1 , sum);
		}
		return helper(array , n - 1 , sum) || helper(array , n - 1 , sum - array[n - 1]);
	}
}
//O(2^n)
