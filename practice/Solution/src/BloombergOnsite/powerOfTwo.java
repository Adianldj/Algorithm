package BloombergOnsite;

public class powerOfTwo {
	 boolean isPowerOfTwo (int x)
	    {
	      /* First x in the below expression is 
	        for the case when x is 0 */
	        return x!=0 && ((x&(x-1)) == 0);
	         
	    }
}