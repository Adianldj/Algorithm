package Tree;

public class LargestPath {
	int global_max;
	public int largestPath(TreeNode root){
		helper(root , 0);
		return global_max;
	}
	public int helper(TreeNode root , int sum){
		if(root == null){
			return 0;
		}
		int left = helper(root.left , sum);
		int right = helper(root.right , sum);
		left = left < 0 ? 0 : left;
		right = right < 0 ? 0 : right;
		global_max = Math.max(global_max, left + right + root.key);
		return Math.max(left, right) + root.key;
		
		
	}
}
