package DP;

import java.util.Deque;
import java.util.LinkedList;

public class LargestHistroam {
	public int largest(int[] height){
		if(height == null || height.length == 0){
			return 0;
		}
		Deque<Integer> stack = new LinkedList<Integer>();
		stack.offerFirst(0);
		int largest = 0;
		for(int i = 1 ; i <= height.length ; i++){
			int cur = i == height.length ? 0 : height[i];
			while(!stack.isEmpty() && height[stack.peekFirst()] > cur){
				int tall = height[stack.pollFirst()];
				int width = stack.isEmpty() ? i : i - stack.peekFirst() - 1;
				largest = Math.max(largest, tall * width);
			}
			stack.offerFirst(i);
		}
		return largest;
	}
}
