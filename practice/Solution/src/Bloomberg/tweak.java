package Bloomberg;

import Tree.TreeNode;

public class tweak {
	public TreeNode tweak(TreeNode root){
		if(root == null){
			return null;
		}
		helper(root.left , root.right);
		return root;
	}
	private void helper(TreeNode root1 , TreeNode root2){
		if(root1 == null && root2 == null){
			return;
		} else if(root1 == null){
			root1 = root2;
			root2 = null;
			tweak(root1);
			
		} else if(root2 == null){
			root2 = root1;
			root1 = null;
			tweak(root2);
			
		} else {
			TreeNode temp = root1;
			root1 = root2;
			root2 = temp;
			helper(root1.left , root1.right);
			helper(root2.left , root2.right);
		}
	}
}
