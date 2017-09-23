package String;

public class Reorder {
	public int[] reorder(int[] array){
		if(array.length % 2 == 0){
			helper(array , 0 , array.length - 1);
		}else{
			helper(array , 0 , array.length - 2);
		}
		return array;
	}
	private void helper(int[] array , int left , int right){
		int size = right - left + 1;
		if(size <= 2){
			return;
		}
		int mid = left + size / 2;
		int lmid = left + size / 4;
		int rmid = left + 3 * size / 4;
		reverse(array , lmid , mid - 1);
		reverse(array , mid  , rmid - 1);
		reverse(array , lmid , rmid - 1);
		helper(array , left , mid - 1);
		helper(array , mid , right);
	
	}
	private void reverse(int[] array , int left , int right){
		while(left <= right){
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}
	public static void main(String[] args) {
		Reorder solution = new Reorder();

		int[] result;
		int[] array = new int[]{1 ,2 , 3 , 4 , 5 , 6 , 7 , 8};
		
		result = solution.reorder(array);
		for(int i = 0 ; i < result.length ; i++){
			System.out.println(result[i]);
		}
	

	}
}
