package BloombergOnsite;

import Tree.TreeNode;

public class sumofLeaft {
	public int sumLeft(TreeNode root){
		if(root == null){
			return 0;
		}
		int res = 0;
		if(root.left != null){
			res = res + root.left.key;
		}
		res += sumLeft(root.left);
		res += sumLeft(root.right);
		return res;
		
	}
}
