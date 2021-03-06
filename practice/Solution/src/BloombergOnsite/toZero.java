package BloombergOnsite;


import java.util.Arrays;

public class toZero {
	public int toZero(int num){
		if(num == 0){
			return 0;
		}
		int max = num;
		for(int i = 2 ; i <= num / 2 ; i++){
			if(num % i == 0){
				max = Math.min(max, toZero(num / i));
			}
		}
		return max;
	}
	public static void main(String[] args) {
		toZero solution = new toZero();

		int num = 4;
		int result = solution.toZero(num);
		System.out.println(result);

		
	}
}
