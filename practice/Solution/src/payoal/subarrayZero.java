package payoal;

import java.util.HashSet;
import java.util.Set;

public class subarrayZero {
	static boolean equalZero(int[] array){
		if(array == null || array.length == 0){
			return false;
		}
		Set<Integer> set = new HashSet<Integer>();
		int sum = 0;
		for(int i = 0 ; i < array.length ; i++){
			sum = sum + array[i];
			if(set.contains(sum)){
				return true;
			} 
			set.add(sum);
		}
		return false;
	}
	public static void main(String[] args){
		int[] array = new int[]{4 , 2 , -5 , 1 , 6};
		if(equalZero(array)){
			System.out.println("Yeah!!");
		}else{
			System.out.println("No");
		}
	}
}
