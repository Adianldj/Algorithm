package Bloomberg;

public class sixDigit {
	public void printSixDigit(){
		for(int i = 100000 ; i < 1000000 ; i++){
			if(isPalindrome(i , 2 , 3)){
				System.out.println(i);
			}
		}
		return;
	}
	private  boolean isPalindrome(int number , int  i , int j){
		char[] array = (number + "").toCharArray();
		while(i >= 0 && j <= 5){
			if(array[i] != array[j]){
				return false;
			}
			i--;
			j++;
		}
		return true;
	}
	public void main(String[] args){
		sixDigit solution = new sixDigit();
		solution.printSixDigit();
	}
}
