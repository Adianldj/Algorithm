package MicrosoftOnsite;

import PhoneIXL.ListNode;



public class removeElementInLinkedList {
	public ListNode deleteDuplicates(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode dummy = new ListNode(head.val == 0 ? 1 : 0);
//        dummy.next = head;
//        ListNode pre = dummy;
//        ListNode cur = head;
//        ListNode first = dummy;
//        while(cur != null && cur.next != null){
//            if(cur.val != pre.val && cur.val != cur.next.val){
//                first.next = cur;
//                first = first.next;
//            }
//            pre = pre.next;
//            cur = cur.next;
//        }
//       
//        if(cur.val != pre.val){
//            first.next = cur;
//            first = first.next;
//        }
//        first.next = null;
//        return dummy.next;
		if(head == null || head.next == null){
			return head;
		}
		ListNode dummy = new ListNode(head.val == 0 ? 1 : 0);
		dummy.next = head;
		ListNode cur = head;
		ListNode first = dummy;
		ListNode pre = dummy;
		while(cur != null && cur.next != null){
			if(cur.val != pre.val && cur.val != cur.next.val){
				first.next = cur;
				first = first.next;
			}
			pre = pre.next;
			cur = cur.next;
		}
		if(cur.val != pre.val){
			first.next = cur;
			first = first.next;
		}
		first.next = null;
		return dummy.next;
    }
}
