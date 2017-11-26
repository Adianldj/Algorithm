package MicrosoftOnsite;

import java.util.Deque;
import java.util.LinkedList;

public class validParentheses {
	public boolean isValid(String s) {
	       if(s == null || s.length() == 0){
	           return true;
	       }
	        Deque<Character> deque = new LinkedList<Character>();
	        for(int i = 0 ; i < s.length() ; i++){
	            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
	                deque.offerFirst(s.charAt(i));
	            } else if(!deque.isEmpty() && s.charAt(i) == ')' && deque.peekFirst() == '(') {
	                deque.pollFirst();
	            } else if(!deque.isEmpty() && s.charAt(i) == ']' && deque.peekFirst() == '[') {
	                deque.pollFirst();
	            } else if(!deque.isEmpty() && s.charAt(i) == '}' && deque.peekFirst() == '{') {
	                deque.pollFirst();
	            } else {
	                return false;
	            }
	        }
	        return deque.isEmpty();
	    }
}
