package MicrosoftOnsite;

import java.util.LinkedList;
import java.util.Queue;

import LinkedList.ListNode;
import Tree.TreeNode;

public class convertListtoTree {
	public TreeNode convert(ListNode head){
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(head == null){
			return null;
		}
		TreeNode root = new TreeNode(head.value);
		queue.add(root);
		head = head.next;
		while(head != null){
			TreeNode parent = queue.poll();
			TreeNode leftchild = new TreeNode(head.value);
			queue.add(leftchild);
			TreeNode rightchild = null;
			head = head.next;
			if(head != null){
				rightchild = new TreeNode(head.value);
				queue.add(rightchild);
				head = head.next;
			}
			parent.left = leftchild;
			parent.right = rightchild;
		}
	    return root;
	}
}
