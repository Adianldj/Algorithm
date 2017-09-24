package Tree;

import java.util.HashSet;
import java.util.Set;

public class pathToTarget {
	public boolean exit(TreeNode root , int target){
		if(root == null){
			return false;
		}
		Set<Integer> set = new HashSet<>();
		set.add(0);
		return helper(root , target , set , 0);
	}
	private boolean helper(TreeNode root , int target , Set<Integer> set , int sum){
		sum = sum + root.key;
		if(set.contains(sum - target)){
			return true;
		}
		boolean in = set.add(sum);
		if(root.left != null && helper(root.left , target , set , sum)){
			return true;
		}
		if(root.right != null && helper(root.right , target , set , sum)){
			return true;
		}
		if(in){
			set.remove(sum);
		}
		return false;
	}
}
