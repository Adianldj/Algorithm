package Bloomberg;

import Tree.TreeNode;

public class connectNode {
	int max;
	public int maxConnect(TreeNode root){
		helper(root);
		return max;
	}
	private int helper(TreeNode root){
		if(root == null){
			return 0;
		}
		int sum = 1;
		int left = helper(root.left);
		int right = helper(root.right);
		if(root.left != null && root.left.key == root.key){
			sum = sum + left;
		}
		if(root.right != null && root.right.key == root.key){
			sum += right;
		}
		max = Math.max(max, sum);
		return sum;
	}
	public static void main(String[] args) {
	TreeNode root = new TreeNode(2);
	root.left = new TreeNode(1);
	root.right = new TreeNode(2);
	root.right.right = new TreeNode(2);
	root.right.left = new TreeNode(2);
	connectNode sol = new connectNode();
	System.out.println(sol.maxConnect(root));
	}

}
