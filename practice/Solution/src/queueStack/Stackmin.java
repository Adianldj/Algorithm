package queueStack;

import java.util.LinkedList;

public class Stackmin {
	LinkedList<Integer> stack;
	LinkedList<Integer> minstack;
		public Stackmin(){
			stack = new LinkedList<Integer>();
			minstack = new LinkedList<Integer>();
		}
		public int pop(){
			if(stack.isEmpty()){
				return -1;
			}
			Integer result = stack.pollFirst();
			if(minstack.peekFirst().equals(result)){
				minstack.pollFirst();
			}
			return result;
		}
		public void push(int element){
			stack.offerFirst(element);
			if(minstack.isEmpty() || element <= minstack.peekFirst()){
				minstack.offerFirst(element);
			}
		}
		public int top(){
			if(stack.isEmpty()){
				return -1;
			}
			return stack.peekFirst();
		}
		public int min(){
			if(minstack.isEmpty()){
				return -1;
			}else{
				return minstack.peekFirst();
			}
		}
}
