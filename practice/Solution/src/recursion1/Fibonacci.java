package recursion1;

public class Fibonacci {
	public long fibo(int n){
		if(n <= 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}
		long[] array = new long[n + 1];
		array[1] = 1;
		for(int i = 2 ; i < n + 1 ; i++){
			array[i] = array[i - 1] + array[i - 2];
		}
		return array[n];
	}
	public static void main(String[] args){
		Fibonacci solution = new Fibonacci();
		
		int n = 10;
		long result;
		result = solution.fibo(n);
		System.out.println(result);
	}
}
