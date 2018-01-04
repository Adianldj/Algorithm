package Bloomberg;



import LinkedList.ListNode;

public class OddEvenLinkedList {
	private ListNode oddEven(ListNode head){
		if(head == null){
			return null;
		}
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenFirst = even;
		while(true){
			if(odd == null || even == null || even.next == null){
				odd.next = evenFirst;
				break;
			}
			odd.next = even.next;
			odd = odd.next;
			if(odd.next == null){
				even.next = null;
				odd.next = evenFirst;
				break;
			}
			even.next = odd.next;
			even = even.next;
		}
		return head;
		
	}
}
