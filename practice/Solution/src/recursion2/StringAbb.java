package recursion2;


public class StringAbb {
	public boolean match(String input, String pattern) {
		if (input == null && pattern == null) {
			return true;
		}
		if (input == null || pattern == null) {
			return false;
		}
		return helper(input, 0, pattern, 0);
	}

	private boolean helper(String input, int i, String pattern, int j) {
		if (i == input.length() && j == pattern.length()) {
			return true;
			
		}
		if (i >= input.length() || j >= pattern.length()) {
			return false;
		}
		int counter = 0;
		if (isDigit(pattern.charAt(j))) {
			while (j < pattern.length() && isDigit(pattern.charAt(j))) {
				counter = counter * 10 + pattern.charAt(j) - '0';
				j++;
			}
			return helper(input, i + counter, pattern, j);
		} else {
			if (input.charAt(i) == pattern.charAt(j)) {
				return helper(input, i + 1, pattern, j + 1);
			} else {
				return false;
			}
		}
	}

	private boolean isDigit(char digit) {
		int m = digit - '0';
		if (m >= 0 && m <= 9) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		StringAbb solution = new StringAbb();
		String input = "aaabbbcccddd";
		String pattern = "a10";
		boolean result;
		result = solution.match(input , pattern);
	    System.out.println(result);
		

	}

}
