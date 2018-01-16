package BloombergOnsite;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Tree.TreeNode;

public class inorderBinary {
	public List<Integer> inorder(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		if(root == null){
			return result;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur = root;
		while(cur != null || !stack.isEmpty()){
			if(cur != null){
				stack.push(cur);
				cur = cur.left;
			} else {
				cur = stack.pop();
				result.add(cur.key);
				cur = cur.right;
			}
		}
		return result;
	}
}
