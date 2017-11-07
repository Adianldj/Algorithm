package Microsoft;

import Tree.TreeNode;

public class closestNumber {
	public int closestValue(TreeNode root , double target){
		int a = root.key;
		TreeNode kid = a < target ? root.right : root.left;
		if(kid == null){
			return root.key;
		}
		int val = closestValue(kid , target);
		if(Math.abs(val - target) < Math.abs(a - target)){
			return val;
		}else{
			return a;
		}
	}
}
