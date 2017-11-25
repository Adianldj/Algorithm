package MicrosoftOnsite;

import recursion2.TreeNode;

public class secondLargestinBST {
	public TreeNode secondLargest(TreeNode root){
		TreeNode prev = null;
		TreeNode cur = root;
		if(cur == null){
			return prev;
		}
		while(cur.right != null){
			prev = cur;
			cur = cur.right;
		}
		if(cur.left != null){
			cur = cur.left;
			while(cur.right != null){
				cur = cur.right;
			}
			prev = cur;
		}
		return prev;
	}
}
