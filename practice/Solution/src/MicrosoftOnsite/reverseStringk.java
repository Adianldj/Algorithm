package MicrosoftOnsite;

public class reverseStringk {
	public String reverseStr(String s, int k) {
        char[] array = s.toCharArray();
        int n = array.length;
        int i = 0 ;
        while(i < n){
            int j = Math.min(i + k - 1 , n - 1);
            swap(array , i , j);
            i = i + 2 * k;
        }
        return new String(array);
    }
    private void swap(char[] array , int i , int j){
        while(i < j){
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
