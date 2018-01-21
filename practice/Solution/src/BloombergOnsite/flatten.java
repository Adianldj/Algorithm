package BloombergOnsite;

import java.util.Stack;

import Tree.TreeNode;

public class flatten {
	public void flattenBinary(TreeNode root){
//		if(root == null){
//			return root;
//		}
//		Stack<TreeNode> stack = new Stack<TreeNode>();
//		stack.push(root);
//		while(!stack.isEmpty()){
//			TreeNode cur = stack.pop();
//			if(cur.right != null){
//				stack.push(cur.right);
//			}
//			if(cur.left != null){
//				stack.push(cur.left);
//			}
//			if(!stack.isEmpty()){
//				cur.right = stack.peek();
//			}
//			cur.left = null;
//		}
//		return root;
		 if(root == null){
	            return;
	        }
	        TreeNode left = root.left;
	        TreeNode right = root.right;
	        flattenBinary(left);
	        flattenBinary(right);
	        root.left = null;
	        root.right = left;
	        TreeNode cur = root;
	        while(cur.right != null){
	            cur = cur.right;
	        }
	        cur.right = right;
	}
}
