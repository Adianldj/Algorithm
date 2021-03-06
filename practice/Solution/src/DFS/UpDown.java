package DFS;

import recursion2.TreeNode;

public class UpDown {
	public TreeNode reverse(TreeNode root){
		if(root == null || root.left == null){
			return root;
		}
		TreeNode newroot = reverse(root.left);
		root.left.left = root;
		root.left.right = root.right;
		root.left = null;
		root.right = null;
		return newroot;
	}
}
