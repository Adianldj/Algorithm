package EA;

import Tree.TreeNode;

public class InorderSuccessor {
	public TreeNode inorderSuccessor(TreeNode root , TreeNode p){
		if(root == null){
			return null;
		}
		if(root.key <= p.key){
			return inorderSuccessor(root.right , p);
		}else{
			TreeNode left = inorderSuccessor(root.left , p);
			return left != null ? left : root;
		}
	}
}
