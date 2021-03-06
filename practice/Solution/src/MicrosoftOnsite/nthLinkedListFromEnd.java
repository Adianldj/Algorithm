package MicrosoftOnsite;

import PhoneIXL.ListNode;

public class nthLinkedListFromEnd {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        ListNode first = head;
	        int length = 0;
	        while(first != null){
	            first = first.next;
	            length++;
	        }
	        length = length - n;
	        first = dummy;
	        while(length > 0){
	            first = first.next;
	            length--;
	        }
	        first.next = first.next.next;
	        return dummy.next;
	    }
}
