package BloombergOnsite;

import LinkedList.ListNode;

public class absolutetoSorted {
	public ListNode srtList(ListNode head){
		ListNode pre = head;
		ListNode cur = head.next;
		while(cur != null){
			if(cur.value < pre.value){
				pre.next = cur.next;
				cur.next = head;
				head = cur;
				cur = pre;
			} else {
				pre = cur;
			}
			cur = cur.next;
		}
		return head;
	}
}
