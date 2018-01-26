package BloombergOnsite;

import Tree.TreeNode;

public class twoNodeCousins {
	public boolean isCousin(TreeNode root ,TreeNode p , TreeNode q){
		return level(root , p , 1) == level(root ,q , 1) && !isSibling(root , p , q);
	}
	private int level(TreeNode root , TreeNode p , int level){
		if(root == null){
			return 0;
		}
		if(root == p){
			return level;
		}
		int left = level(root.left , p , level + 1);
		if(left != 0){
			return left;
		}
		return level(root.right , p , level + 1);
		
	}
	private boolean isSibling(TreeNode root , TreeNode p , TreeNode q){
		return (root.left == p && root.right == q) || (root.left == q && root.right == p) 
				||isSibling(root.left , p , q) ||isSibling(root.right , p , q);
	}
}
