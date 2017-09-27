package IXL;

public class validTriangle {
	public boolean isValidTriangle(int a, int b, int c){
		if(a <= 0 || b <= 0 || c<= 0){
			return false;
		}
		int longestSide = a;
		if (b > longestSide )
		    longestSide = b;
		if(c > longestSide )
		    longestSide = c;
		 
		return (longestSide < a + b + c - longestSide);
		}
	public static void main(String[] args) {
		validTriangle solution = new validTriangle();
       
        boolean result;
        result = solution.isValidTriangle(3 , 4 , 5);
        System.out.println(result);
        
       
        result = solution.isValidTriangle(3 ,4 , 7);
		System.out.println(result);
		   
		result = solution.isValidTriangle(3 ,4 , 8);
			System.out.println(result);

	    result = solution.isValidTriangle(9 ,2 , 5);
				System.out.println(result);

	}
}
