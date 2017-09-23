package LinkedList;

public class Reverse {
	public ListNode reverse(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		ListNode prev = null;
		while(head != null){
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
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
		ListNode head = n1;
		while(head != null){
			System.out.println(head.value + "");
			head = head.next;
		}
		ListNode result = new Reverse().reverse(n1);
		ListNode cur = result;
		while(cur != null){
			System.out.println(cur.value + "");
			cur = cur.next;
		}
	}
}
