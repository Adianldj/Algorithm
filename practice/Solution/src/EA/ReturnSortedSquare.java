package EA;

public class ReturnSortedSquare {
	public int[] sortSquare(int[] array){
		if(array == null || array.length == 0){
			return array;
		}
		int n = array.length;
		int i;
		for(i = 0 ; i < n ; i++){
			if(array[i] >= 0){
				break;
			}
		}
		int k = i - 1;
		int j = i;
		int index = 0;
		int[] result = new int[n];
		while(k >= 0 && j < n){
			if(array[k] * array[k] < array[j] * array[j]){
				result[index] = array[k] * array[k];
				k--;
			}else{
				result[index] = array[j] * array[j];
				j++;
			}
			index++;
		}
		while(k >= 0){
			result[index++] = array[k] * array[k];
			k--;
		}
		while(j < n){
			result[index++] = array[j] * array[j];
			j++;
		}
		return result;
		
	}
	public static void main (String[] args) 
    {
        int arr[] = { -6 , -3 , -1 , 2 , 4 , 5 };
        int n = arr.length;
     
        System.out.println("Before sort ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        ReturnSortedSquare solution = new ReturnSortedSquare();
        int[] result = solution.sortSquare(arr);
        System.out.println("");
        System.out.println("After Sort ");
        for (int i = 0 ; i < n ; i++)
            System.out.print(result[i] + " ");
 
    }
}
