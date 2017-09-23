package Tree;

public class LargestSmaller {
	public int largest(TreeNode root, int target) {
		int result = Integer.MIN_VALUE;
		while (root != null) {
			if (root.key >= target) {
				root = root.left;
			} else {
				result = root.key;
				root = root.right;
			}
		}
		return result;
	}
}
