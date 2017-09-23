package LinkedList;

public class Partition {
		public ListNode partition(ListNode head , int target){
			if(head == null){
				return null;
			}
			ListNode small = new ListNode(0);
			ListNode large = new ListNode(0);
			ListNode cursmall = small;
			ListNode curlarge = large;
			while(head != null){
				if(head.value < target){
					 cursmall.next  = head;
					 cursmall = cursmall.next;
				}else{
					curlarge.next = head;
					curlarge = curlarge.next;
				}
				head = head.next;
			}
			cursmall.next = large.next;
			curlarge.next = null;
			return small.next;
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
			int target = 3;
			ListNode result = new Partition().partition(n1 , target);
			ListNode cur = result;
			while(cur != null){
				System.out.println(cur.value + "");
				cur = cur.next;
			}
		}
}
