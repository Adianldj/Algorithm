package practice1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Tree.TreeNode;

public class LCAK {
	public TreeNode LCA(TreeNode root , List<TreeNode> nodes){
		if(root == null){
			return root;
		}
		Set<TreeNode> set = getSet(nodes);
		if(set.contains(root)){
			return root;
		}
		TreeNode left = LCA(root.left , nodes);
		TreeNode right = LCA(root.right , nodes);
		if(left != null && right != null){
			return root;
		}
		
		return left == null ? right : left;
	
	}
	private Set<TreeNode> getSet(List<TreeNode> nodes){
		Set<TreeNode> set = new HashSet<TreeNode>();
		for(TreeNode node : nodes){
			set.add(node);
		}
		return set;
	}
	
}
