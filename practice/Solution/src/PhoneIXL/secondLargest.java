package PhoneIXL;

public class secondLargest {
	public int second(int[] nums){
		int num1 = Integer.MIN_VALUE;
		int num2 = Integer.MIN_VALUE;
		for(int n : nums){
			if(n > num1){
				num2 = num1;
				num1 = n;
			}else if(n > num2){
				num2 = n;
			}
		}
		return num2;
	}
}
//Time:O(n) Space:o(1)