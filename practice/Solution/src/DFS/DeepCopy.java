package DFS;

import java.util.HashMap;
import java.util.Map;

public class DeepCopy {
	public RandomListNode copy(RandomListNode head) {
		if (head == null) {
			return null;
		}
		Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		RandomListNode newHead = new RandomListNode(head.value);
		map.put(head, newHead);
		RandomListNode cur = newHead;
		while (head != null) {
			if (head.next != null) {
				if (!map.containsKey(head.next)) {
					map.put(head.next, new RandomListNode(head.next.value));
				}
				cur.next = map.get(head.next);
			}
			if (head.random != null) {
				if (!map.containsKey(head.random)) {
					map.put(head.random, new RandomListNode(head.random.value));
				}
				cur.random = map.get(head.random);
			}
			cur = cur.next;
			head = head.next;
		}
		return newHead;
	}
}
