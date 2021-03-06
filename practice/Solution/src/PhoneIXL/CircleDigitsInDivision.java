package PhoneIXL;

import java.util.ArrayList;
import java.util.List;

import String.missing;

public class CircleDigitsInDivision {
	public static String circleDigits(int dividend, int divisor) {
		if (dividend < 0 || divisor <= 0) {
			return null;
		}
		if (dividend % divisor == 0) {
			return null;
		}
		List<Integer> quotientList = new ArrayList<Integer>();//store a/b
		List<Integer> leftList = new ArrayList<Integer>();//store a%b
		int left= dividend % divisor;
		while(!leftList.contains(left)){
			leftList.add(left);
			left*=10;
			int quotient=left / divisor;
			quotientList.add(quotient);
			left%=divisor;
			if(left==0){
				return null;
			}
		}
		int circleBegin=leftList.indexOf(left);
		quotientList = quotientList.subList(circleBegin,quotientList.size());
		StringBuilder sb=new StringBuilder();
		for(int i=0,len=quotientList.size();i<len;i++){
			sb.append(quotientList.get(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		CircleDigitsInDivision solution = new CircleDigitsInDivision();
		String result = solution.circleDigits(10 , 7);
		
		System.out.println(result);

	

	}
}
