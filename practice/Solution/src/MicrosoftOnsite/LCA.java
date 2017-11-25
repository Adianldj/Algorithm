package MicrosoftOnsite;

import Tree.TreeNode;

public class LCA {
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	     if(root.key > p.key && root.key > q.key){
	         return lowestCommonAncestor(root.left , p , q);
	     } else if (root.key < p.key && root.key < q.key){
	         return lowestCommonAncestor(root.right , p , q);
	     } else {
	         return root;
	     }
	    }

}
