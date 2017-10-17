package PhoneIXL;

import LinkedList.ListNode;
import LinkedList.middleNode;

public class kthendLinkedlist {
	public ListNode nthtoLast(ListNode head , int n){
		if(head == null || n < 1){
			return null;
		}
		ListNode p1 = head;
		ListNode p2 = head;
		for(int i = 0 ; i < n - 1; i++){
			if(p2 == null){
				return null;
			}
			p2 = p2.next;
		}
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
	public static void main(String[] args){
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(5);
		ListNode n5 = new ListNode(1);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		
		
		ListNode result = new kthendLinkedlist().nthtoLast(n1 , 4);
		
		System.out.println(result.value);
	}
}
//Time:o(n) Space: o(1)