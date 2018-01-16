package Bloomberg;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class slidingWindow {
	public List<Integer> maxWindow(int[] array , int k){
		List<Integer> result = new ArrayList<Integer>();
		Deque<Integer> deque = new LinkedList<Integer>();
		for(int i = 0 ; i < array.length ; i++){
			while(!deque.isEmpty() && array[deque.peekFirst()] <= array[i]){
				deque.pollLast();
			}
			if(!deque.isEmpty() && deque.peekFirst() <= i - k){
				deque.pollFirst();
			}
			deque.offerLast(i);
			if(i >= k- 1){
				result.add(array[deque.peekFirst()]);
			}
		}
		return result;
	}
		
}
