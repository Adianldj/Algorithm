package LinkedList;

public class Merge {
	public ListNode mergeNode(ListNode one , ListNode two){
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		if(one == null){
			return two;
		}
		if(two == null){
			return one;
		}
		while(one != null && two != null){
			if(one.value <= two.value){
				dummy.next = one;
				one = one.next;
			}else{
				dummy.next = two;
				two = two.next;
			}
			dummy = dummy.next;
		}
		if(one != null){
			dummy.next = one;
		}else{
			dummy.next = two;
		}
		return cur.next;
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
		
		ListNode n6 = new ListNode(1);
		ListNode n7 = new ListNode(2);
		ListNode n8 = new ListNode(3);
		ListNode n9 = new ListNode(4);
		
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = null;
	
		
		ListNode result = new Merge().mergeNode(n1 , n6);
		ListNode cur = result;
		while(cur != null){
			System.out.println(cur.value + "");
			cur = cur.next;
		}
	}
}
