package PhoneIXL;




public class middlePoint {
	public ListNode mid(ListNode head){
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
