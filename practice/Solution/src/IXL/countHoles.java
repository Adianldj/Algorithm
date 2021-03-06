package IXL;





public class countHoles {
	public int countingHoles(int[] num) {
		if(num == null || num.length == 0){
			return 0;
		}
		int numOfHoles = 0;
		for (int i = 0; i < num.length; i++) {

			if (num[i] == 8) {
				numOfHoles += 2;
			} else if (num[i] == 0 || num[i] == 4 || num[i] == 6 || num[i] == 9) {
				numOfHoles++;
			}

		}
		return numOfHoles;
	}
	
	public static void main(String[] args) {
		countHoles solution = new countHoles();
        int[] array = null;
        int result;
        result = solution.countingHoles(array);
        System.out.println(result);
        
        array = new int[0];
        result = solution.countingHoles(array);
		System.out.println(result);
		
        array = new int[] { 1, 2, 3, 4 };
		result = solution.countingHoles(array);
		System.out.println(result);

		array = new int[] { 4, 8, 9, 6 };
		result = solution.countingHoles(array);
		System.out.println(result);


		array = new int[] { 2, 4, 1, 5, 3,4,8,8,9,9,6,4 };
		result = solution.countingHoles(array);
		System.out.println(result);


	}
}
