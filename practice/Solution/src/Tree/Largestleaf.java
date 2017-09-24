package Tree;

public class Largestleaf {
	int global_max = Integer.MIN_VALUE;
	public int max(TreeNode root){
		helper(root , 0);
		return global_max;
	}
	private void helper(TreeNode root , int sum){
		if(root == null){
			return;
		}
		if(sum <  0){
			sum = root.key;
		}else{
			sum = sum + root.key;
		}
		global_max = Math.max(global_max, sum);
		helper(root.left , sum);
		helper(root.right , sum);
	}
}
