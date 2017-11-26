package MicrosoftOnsite;

import java.util.ArrayList;
import java.util.List;

import Tree.TreeNode;

public class searchRangeBST {
	public List<Integer> searchRange(TreeNode root , int k1 , int k2){
		List<Integer> result = new ArrayList<Integer>();
		if(root == null) {
			return result;
		}
		if(root.key < k1){
			return searchRange(root.right , k1 , k2);
		}
		if(root.key > k2) {
			return searchRange(root.left , k1 , k2);
		}
		if(root.key >= k1 && root.key <= k2){
			List<Integer> left = searchRange(root.left , k1 , k2);
			List<Integer> right = searchRange(root.right , k1 , k2);
			result.addAll(left);
			result.add(root.key);
			result.addAll(right);
			
		}
		return result;
		
	}
}
