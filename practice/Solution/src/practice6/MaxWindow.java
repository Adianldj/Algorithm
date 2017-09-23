package practice6;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MaxWindow {
	public List<Integer> maxWindow(int[] array , int k){
		List<Integer> result = new ArrayList<Integer>();
		Deque<Integer> deque = new LinkedList<Integer>();
		for(int i = 0 ; i < array.length ; i++){
			while(!deque.isEmpty() && array[deque.peekLast()] <= array[i]){
				deque.pollLast();
			}
			if(!deque.isEmpty() && deque.peekFirst() <= i - k){
				deque.pollFirst();
			}
			deque.offerLast(i);
			if(i >= k - 1){
				result.add(array[deque.peekFirst()]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		MaxWindow solution = new MaxWindow();

		int[] array1 = new int[] { 1, 2, 3, 4 , 8 , 6 ,4 , 7 };
		List<Integer> result;

		result = solution.maxWindow(array1 , 3);
		for(int i  = 0 ; i < result.size() ; i++){
				System.out.println(result.get(i));
		}

	}
	
 }
