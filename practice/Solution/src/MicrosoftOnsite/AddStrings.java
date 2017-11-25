package MicrosoftOnsite;

public class AddStrings {
	public String addStrings(String s1 , String s2){
		if(s1 == null || s1.length() == 0){
			return s2;
		}
		if(s2 == null || s2.length() == 0){
			return s1;
		}
		int n = s1.length() - 1;
		int m = s2.length() - 1;
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		while(n >= 0 || m >= 0 || carry > 0){
			int val1 = n >= 0 ? s1.charAt(n) - '0' : 0;
			int val2 = m >= 0 ? s2.charAt(m) - '0' : 0;
			sb.append((val1 + val2 + carry) % 10);
			carry = (val1 + val2 + carry) / 10;
			m--;
			n--;
		}
		return sb.reverse().toString();
	}
}
