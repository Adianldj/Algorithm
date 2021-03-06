package IXL;

public class countHoles2 {
	public int countHoles(int num){
		int numOfHoles = 0;
		if(num == 0){
			return 1;
		}
		while(num != 0){
			int mod = num % 10;
			if (mod == 8) {
				numOfHoles += 2;
			} else if (mod == 0 || mod == 4 || mod == 6 || mod == 9) {
				numOfHoles++;
			}
			num = num / 10;

		}
		return numOfHoles;
	}
	public static void main(String[] args) {
		countHoles2 solution = new countHoles2();
        int result;
        
        int array = 0;
        result = solution.countHoles(array);
		System.out.println(result);
		
        array = 4;
        result = solution.countHoles(array);
		System.out.println(result);
		
		array = 4896;
		result = solution.countHoles(array);
		System.out.println(result);


		array = 241548899;
		result = solution.countHoles(array);
		System.out.println(result);
		
		array = 100;
		result = solution.countHoles(array);
		System.out.println(result);

	}
}
