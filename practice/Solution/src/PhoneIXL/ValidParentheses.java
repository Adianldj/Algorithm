package PhoneIXL;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {
	public boolean isValid(String s){
		if(s == null || s.length() == 0){
			return true;
		}
		Deque<Character> stack = new LinkedList<Character>();
		for(int i = 0 ; i < s.length() ; i++){
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
				stack.offerFirst(s.charAt(i));
			}else if(!stack.isEmpty() && s.charAt(i) == ')' && stack.peekFirst() == '('){
				stack.pollFirst();
			}else if(!stack.isEmpty() && s.charAt(i) == ']' && stack.peekFirst() == '['){
				stack.pollFirst();
			}else if(!stack.isEmpty() && s.charAt(i) == '}' && stack.peekFirst() == '{'){
				stack.pollFirst();
			}else{
				return false;
			}
		}
		return stack.isEmpty();
	}
}
//Time/Space:O(n)