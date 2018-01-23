package BloombergOnsite;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import LinkedList.ListNode;

public class UniontwoList {
	private ListNode inter(ListNode n1 , ListNode n2){
		if(n1 == null){
			return n2;
		}
		if(n2 == null){
			return n1;
		}
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		Set<Integer> set = new HashSet<Integer>();
		while(n1 != null){
			if(!set.contains(n1.value)){
				set.add(n1.value);
			}
		}
		while(n2 != null){
			if(set.contains(n2.value)){
				cur.next = new ListNode(n2.value);
				cur = cur.next;
			}
		}
		return dummy.next;
	}
	public ListNode merge(ListNode n1 , ListNode n2){
		if(n1 == null){
			return n2;
		}
		if(n2 == null){
			return n1;
		}
		Map<Integer , Integer> map = new HashMap<Integer , Integer>();
		while(n1 != null){
			if(map.containsKey(n1.value)){
				map.put(n1.value , map.get(n1.value) + 1);
			} else {
				map.put(n1.value, 1);
			}
			n1 = n1.next;
		}
		while(n2 != null){
			if(map.containsKey(n2.value)){
				map.put(n2.value , map.get(n2.value) + 1);
			} else {
				map.put(n2.value, 1);
			}
			n2 = n2.next;
		}
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		for(int n : map.keySet()){
			for(int i = 0 ; i < map.get(n) ; i++){
				cur.next = new ListNode(n);
				cur = cur.next;
			}
		}
		return dummy.next;
	}
}
