package MicrosoftOnsite;

import Tree.TreeNode;

public class hasPathSum {
	 public boolean hasPathSum(TreeNode root, int sum) {
	      if(root == null) {
	          return false;
	      }
	        if(root.left == null && root.right == null && sum - root.key == 0){
	            return true;
	        }
	       return hasPathSum(root.left , sum - root.key) || hasPathSum(root.right , sum - root.key); 
	    }
	}

