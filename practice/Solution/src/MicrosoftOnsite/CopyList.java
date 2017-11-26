package MicrosoftOnsite;

import java.util.HashMap;
import java.util.Map;

import DFS.RandomListNode;

public class CopyList {
	public RandomListNode copyRandomList(RandomListNode head) {
	      if(head == null){
	          return head;
	      }
	        Map<RandomListNode , RandomListNode> map = new HashMap<RandomListNode , RandomListNode>();
	        RandomListNode cur = head;
	        while(cur != null){
	            map.put(cur , new RandomListNode(cur.value));
	            cur = cur.next;
	        }
	        cur = head;
	        while(cur != null){
	            RandomListNode temp = map.get(cur);
	            temp.next = map.get(cur.next);
	            temp.random = map.get(cur.random);
	            cur = cur.next;
	        }
	        return map.get(head);
	    }
}
