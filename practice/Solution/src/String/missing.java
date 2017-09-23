package String;


import java.util.HashSet;
import java.util.Set;

public class missing {
		public int missingNumber(int[] array){
			if(array == null || array.length <= 0){
				return -1;
			}
			Set<Integer> set = new HashSet<Integer>();
			for(int i = 0 ; i < array.length ; i++){
				set.add(array[i]);
			}
			for(int i = 1 ; i <= array.length + 1 ; i++){
				if(!set.contains(i)){
					return i;
				}
			}
			return -1;
			
		}
		public static void main(String[] args) {
			missing solution = new missing();

			int result;
			int[] array;
			array = new int[] { 1, 2 , 4 };
			result = solution.missingNumber(array);
			System.out.println(result);

		

		}
}
