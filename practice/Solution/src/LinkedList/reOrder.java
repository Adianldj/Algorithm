package LinkedList;

public class reOrder {
	public ListNode reorder(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		ListNode index = findMiddle(head);
		ListNode first = head;
		ListNode second = index.next;
		index.next = null;
		ListNode second2 = reverse(second);
		return merge(first , second2);
		
	}
	public ListNode findMiddle(ListNode head){
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
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
	public ListNode merge(ListNode l1 , ListNode l2){
		if(l1 == null){
			return l2;
		}
		if(l2 == null){
			return l1;
		}
		ListNode dummyNode = new ListNode(0);
		ListNode cur = dummyNode;
		while(l1 != null && l2 != null){
			cur.next = l1;
			l1 = l1.next;
			cur.next.next = l2;
			cur = cur.next.next;
			l2 = l2.next;
		}
		if(l1 != null){
			cur.next = l1;
		}else{
			cur.next = l2;
		}
		return dummyNode.next;
		
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
		ListNode result = new reOrder().reorder(n1);
		ListNode cur = result;
		while(cur != null){
			System.out.println(cur.value + "");
			cur = cur.next;
		}
	}
}
