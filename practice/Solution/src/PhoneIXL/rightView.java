package PhoneIXL;

import java.util.ArrayList;
import java.util.List;

import Tree.TreeNode;

public class rightView {
	public List<Integer> rightView(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		helper(root , 0 , result);
		return result;
	}
	private void helper(TreeNode root , int depth , List<Integer> result){
		if(root == null){
			return;
		}
		if(depth == result.size()){
			result.add(root.key);
		}
		helper(root.right , depth + 1 , result);
		helper(root.left , depth + 1 , result);
	}
}
