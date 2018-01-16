package BloombergOnsite;

import LinkedList.ListNode;

public class insertLinkedList {
	 public ListNode insert(ListNode head, int value) {
		    // write your solution here
		    ListNode node = new ListNode(value);
		    if(head == null || value <= head.value){
		      node.next = head;
		      return node;
		    }
		    ListNode cur = head;
		    while(cur.next != null && cur.next.value < value){
		      cur = cur.next;
		    }
		    ListNode next = cur.next;
		    cur.next = node;
		    node.next = next;
		    return head;
		  }
}
