package recursion2;

import LinkedList.ListNode;


public class reverseInPairs {
	public ListNode reverse(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		ListNode newHead = reverse(head.next.next);
		ListNode next = head.next;
		head.next = newHead;
		next.next = head;
		return next;
	}
	public static void main(String[] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		ListNode head = n1;
	    reverseInPairs solution = new reverseInPairs();
	    ListNode result = solution.reverse(head);
		while(result != null){
			System.out.println(result.value + "");
			result = result.next;
		}
	}
}
