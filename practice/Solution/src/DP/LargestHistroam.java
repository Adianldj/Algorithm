package DP;

import java.util.Deque;
import java.util.LinkedList;

public class LargestHistroam {
	public int largest(int[] array){
		if(array == null || array.length == 0){
			return 0;
		}
		Deque<Integer> stack = new LinkedList<Integer>();
		stack.offerFirst(0);
		int largest = 0;
		for(int i = 1 ; i <= array.length ; i++){
			int cur = i == array.length ? 0 : array[i];
			while(!stack.isEmpty() && array[stack.peekFirst()] > cur){
				int height = array[stack.pollFirst()];
				int width = stack.isEmpty() ? i : i - stack.peekFirst() - 1;
				largest = Math.max(largest, height * width);
			}
			stack.offerFirst(i);
		}
		return largest;
	}
}
