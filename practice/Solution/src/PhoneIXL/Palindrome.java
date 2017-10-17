package PhoneIXL;

public class Palindrome {
	public boolean isPalindrom(ListNode head){
		ListNode fast = head;
		ListNode slow = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		slow = reverse(slow);
		fast = head;
		while(fast != null && slow != null){
			if(fast.val != slow.val){
				return false;
			}
			fast = fast.next;
			slow = slow.next;
		}
		return true;
	}
	private ListNode reverse(ListNode head){
		ListNode pre = null;
		while(head != null){
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
}
//Time:o(n)