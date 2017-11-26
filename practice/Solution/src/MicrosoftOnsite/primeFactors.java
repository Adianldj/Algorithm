package MicrosoftOnsite;

import java.util.HashSet;
import java.util.Set;

public class primeFactors {
	public Set<Long> primeFactor(long number){
		long i;
		Set<Long> set = new HashSet<Long>();
		long copyOfInput = number;
		for(i = 2 ; i <= copyOfInput ; i++){
			if(copyOfInput % i == 0){
				set.add(i);
				copyOfInput /= i;
				i--;
				
			}
		}
		return set;
	}
}
