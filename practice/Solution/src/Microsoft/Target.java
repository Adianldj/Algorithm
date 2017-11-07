package Microsoft;

import Tree.TreeNode;

public class Target {
	public boolean findTarget(TreeNode root , int target){
		if(root == null){
			return true;
		}
		if(root.key == target){
			return true;
		}else if(root.key < target){
			return findTarget(root.right , target);
		}else {
			return findTarget(root.left , target);
		}
	}
}
