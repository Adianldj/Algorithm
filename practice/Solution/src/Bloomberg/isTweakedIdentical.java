package Bloomberg;

import Tree.TreeNode;

public class isTweakedIdentical {
	public boolean isTweaked(TreeNode root1 , TreeNode root2){
		if(root1 == null && root2 == null){
			return true;
		} else if(root1 == null || root2 == null){
			return false;
		} else if(root1.key != root2.key){
			return false;
		} else {
			return (isTweaked(root1.left , root2.left) && isTweaked(root1.right , root2.right)) || (isTweaked(root1.left , root2.right) && isTweaked(root1.right , root2.left));
		}
	}
}
