package PhoneIXL;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import LinkedList.ListNode;

public class MergeKSortedList {
	public ListNode merge(List<ListNode> listOfLists){
		PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(11 , new MyComparator());
		ListNode dummyNode = new ListNode(0);
		ListNode cur = dummyNode;
		for(ListNode node : listOfLists){
			if(node != null){
				minHeap.offer(node);
			}
		}
		while(!minHeap.isEmpty()){
			ListNode node = minHeap.poll();
			cur.next = node;
			if(node.next != null){
				minHeap.offer(node.next);
			}
			cur = cur.next;
		}
		return dummyNode.next;
	}
	static class MyComparator implements Comparator<ListNode>{
		@Override
		public int compare(ListNode l1 , ListNode l2){
			if(l1.value == l2.value){
				return 0;
			}
			return l1.value < l2.value ? -1 : 1;
		}
	}
}
