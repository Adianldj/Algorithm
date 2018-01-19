package BloombergOnsite;

import Tree.TreeNode;

public class removeAllNodes {
	private TreeNode removeNodes(TreeNode root){
		if(root == null){
			return null;
		}
		if(root.left == null && root.right == null){
			root = null;
		} else {
			root.left = removeNodes(root.left);
			root.right = removeNodes(root.right);
		}
		return root;
	}
}
