package PhoneIXL;



import java.util.Arrays;
import java.util.Random;

public class Fibonacci {
	public static int generate(int upperBound) {  
		Random random = new Random();
		if(upperBound == 0){
			return 0;
		}
		int a= 0 , b = 1 , c = 0;
		int res = random.nextInt(2);
		for(int i = 2 ; c < upperBound ; i++){
			if(random.nextInt(i + 1) == i){
				res = c;
			}
			c = a + b;
			a = b;
			b = c;
		}
		return res;
	}
	public static void main(String[] args) {
		Fibonacci solution = new Fibonacci();

		int upperBound = 15;
		int result = solution.generate(upperBound);
		System.out.println(result);

		
	}
}
