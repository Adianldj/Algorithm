package MicrosoftOnsite;

import LinkedList.ListNode;

public class deleteNode {
	public void delete(ListNode head , int target){
		ListNode temp = head;
		ListNode prev = null;
		if(temp != null && temp.value == target){
			head = temp.next;
			return;
		}
		while(temp != null && temp.value != target){
			prev = temp;
			temp = temp.next;
		}
		if(temp == null){
			return;
		}
		prev.next = temp.next;
		
		
		
	}
}
