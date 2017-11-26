package MicrosoftOnsite;

import java.util.LinkedList;

public class implementQueue {
	private  LinkedList<Integer> in;
	private  LinkedList<Integer> out;
  public implementQueue() {
    // Write your solution here.
    in = new LinkedList<Integer>();
		out = new LinkedList<Integer>();
  }
  
  public Integer poll() {
    mov();
		return out.isEmpty()? null : out.pollFirst();
  }
  
  public void offer(int element) {
    in.offerFirst(element);
  }
  
  public Integer peek() {
    mov();
		return out.isEmpty()? null : out.peekFirst();
  }
  
  public int size() {
    return in.size() + out.size();
  }
  public void mov(){
		if(out.isEmpty()){
			while(!in.isEmpty()){
				out.offerFirst(in.pollFirst());
			}
		}
	}
  
  public boolean isEmpty() {
    return in.isEmpty() && out.isEmpty();
  }
}
