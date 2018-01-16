package BloombergOnsite;

import Tree.TreeNode;

public class kthinBST {
	 public int kthSmallest(TreeNode root, int k) {
		   
	        int count = countNodes(root.left);
	        if(count >= k){
	            return kthSmallest(root.left , k);
	        } else if(count + 1 < k){
	            return kthSmallest(root.right , k - count - 1);
	        } else {
	            return root.key;
	        }
	    }
	    private int countNodes(TreeNode root){
	        if(root == null){
	            return 0;
	        }
	        return 1 + countNodes(root.left) + countNodes(root.right);
	    }
}
