package LinkedList;

public class insertNode {
	public ListNode insert(ListNode head , int value){
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
		while(head != null){
			System.out.println(head.value + "");
			head = head.next;
		}
		ListNode result = new insertNode().insert(n1 , 3);
		ListNode cur = result;
		while(cur != null){
			System.out.println(cur.value + "");
			cur = cur.next;
		}
	}
}
