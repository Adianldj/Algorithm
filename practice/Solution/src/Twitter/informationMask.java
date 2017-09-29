import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	private static String emailHiding(String email) {
		StringBuilder sb = new StringBuilder();
		sb.append("E:");
		sb.append(email.charAt(0));
		sb.append("*****");
		int start = email.lastIndexOf('@') - 1;
		sb.append(email.substring(start));
		return sb.toString();
	}

	private static String phoneHiding(String phone) {
		char[] array = phone.toCharArray();
		StringBuilder sb = new StringBuilder();
		boolean addition = false;
		sb.append("P:");
		int number = 0;
		for (char element : array) {
			if (Character.isDigit(element)) {
				number++;
			}
		}
		int country = number - 10;
		if (country > 0) {
			addition = true;
			sb.append('+');
		}
		int index = 0;
		while (country > 0 && index < array.length) {
			if (Character.isDigit(array[index])) {
				sb.append('*');
				country--;
			}
			index++;
		}
		if (addition) {
			sb.append('-');
		}
		int count = 0;
		while (count < 3 && index < array.length) {
			if (Character.isDigit(array[index])) {
				sb.append('*');
				count++;
			}
			index++;
		}
		sb.append('-');
		count = 0;
		while (count < 3 && index < array.length) {
			if (Character.isDigit(array[index])) {
				sb.append('*');
				count++;
			}
			index++;
		}
		sb.append('-');
		count = 0;
		while (count < 4 && index < array.length) {
			if (Character.isDigit(array[index])) {
				sb.append(array[index]);
				count++;
			}
			index++;
		}
		return sb.toString();

	}

	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while ((input = br.readLine()) != null) {

			String[] inputs = input.trim().split(":");
			if (inputs[0].trim().equals("E")) {
				System.out.println(emailHiding(inputs[1].trim()));
			} else if (inputs[0].trim().equals("P")) {
				System.out.println(phoneHiding(inputs[1].trim()));
			}
		}
		br.close();

	}
}
