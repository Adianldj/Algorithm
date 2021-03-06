package DFS;



import java.util.ArrayList;

import java.util.List;

public class ThreeCommon {
	public List<Integer> three(int[] a , int[] b , int[] c){
		List<Integer> result = new ArrayList<Integer>();
		int ai = 0;
		int bi = 0;
		int ci = 0;
		while(ai < a.length && bi < b.length && ci < c.length){
			if(a[ai] == b[bi] && b[bi] == c[ci]){
				result.add(a[ai]);
				ai++;
				bi++;
				ci++;
			}else if(a[ai] >= b[bi] && a[ai] >= c[ci]){
				bi++;
				ci++;
			}else if(b[bi] >= a[ai] && b[bi] >= c[ci]){
				ai++;
				ci++;
			}else if(c[ci] >= a[ai] && c[ci] >= b[bi]){
				ai++;
				bi++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		ThreeCommon solution = new ThreeCommon();

	    int[] a = {1 , 2 , 3};
	    int[] b = {1 , 4 , 5};
	    int[] c = {1 , 2 , 4};
		List<Integer> result;
		result = solution.three(a ,b ,c);
		for(int i = 0 ; i < result.size() ; i++){
			System.out.println(result.get(i));
		}

	}
}
