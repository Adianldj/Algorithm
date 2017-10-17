package PhoneIXL;

public class countSquares {
	public int count(int m , int n){
		if(n < m){
			swap(n , m);
		}
		return m * (m + 1) * (2 * m + 1) + (n - m) * m * (m + 1) / 2;
	}
	private void swap(int n , int m){
		int temp = n;
		n = m;
		m = temp;
	}
}
//time/space:o(1)