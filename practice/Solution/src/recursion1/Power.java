package recursion1;

public class Power {
	public long power(int a, int b) {
		if (a == 0) {
			return 0;
		}
		if (b == 0) {
			return 1;
		}
		long half = power(a, b / 2);
		if (b % 2 == 0) {
			return half * half;
		} else {
			return half * half * a;
		}
	}

	public static void main(String[] args) {
		Power solution = new Power();

		int a = 10;
		int b = 2;
		long result;
		result = solution.power(a, b);
		System.out.println(result);
	}
}
