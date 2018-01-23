package BloombergOnsite;


import java.util.PriorityQueue;

import LinkedList.ListNode;

public class mergeKsortedList {
	 public ListNode mergeKLists(ListNode[] lists) {
	        if(lists == null || lists.length == 0){
	            return null;
	        }
	        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(lists.length);
//	        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(lists.length , new Comparator<ListNode>(){
//	            @Override
//	            public int compare(ListNode o1 , ListNode o2){
//	                if(o1.val == o2.val){
//	                    return 0;
//	                }
//	                return o1.val < o2.val ? -1 : 1;
//	            }
//	        });
	        for(ListNode node : lists){
	            if(node != null){
	                minHeap.offer(node);
	            }
	        }
	        ListNode dummy = new ListNode(0);
	        ListNode cur = dummy;
	        while(!minHeap.isEmpty()){
	            ListNode temp = minHeap.poll();
	            cur.next = new ListNode(temp.value);
	            cur = cur.next;
	            if(temp.next != null){
	                minHeap.offer(temp.next);
	            }
	        }
	        return dummy.next;
	    }
}
