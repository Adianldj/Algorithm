package MicrosoftOnsite;

import PhoneIXL.ListNode;

public class remove {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode list = head;
        while(list != null){
            if(list.next == null){
                break;
            }
            if(list.val == list.next.val){
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }
        return head;
    }
}
