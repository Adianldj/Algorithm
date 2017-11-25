package MicrosoftOnsite;

public class binaryRepresentation {
	public void bin(int n){
		int i;
		for(i = 1 << 31 ; i > 0 ; i = i / 2){
			if((n & i) == 1){
				System.out.print("1");
			} else{
				System.out.print("0");
			}
		}
	}
}
