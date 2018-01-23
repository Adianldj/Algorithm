package BloombergOnsite;

public class myPow {
	public double myPow(double x , int n){
		if(n == 0){
			return 1;
		}
		if(n < 0){
			x = 1. / x;
			n = -n;
		}
		if(Double.isInfinite(x)){
			return 0;
		}
		return n % 2 == 0 ? myPow(x * x , n / 2) : x * myPow(x * x , n / 2);
		
	}
}
