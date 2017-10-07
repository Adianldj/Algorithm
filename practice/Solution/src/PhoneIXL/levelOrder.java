package PhoneIXL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Tree.TreeNode;

public class levelOrder {
	public List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null){
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()){
			int size = queue.size();
			List<Integer> temp = new ArrayList<Integer>();
			for(int i = 0 ; i < size ; i++){
				TreeNode cur = queue.poll();
				temp.add(cur.key);
				if(cur.left != null){
					queue.offer(cur.left);
				}
				if(cur.right != null){
					queue.offer(cur.right);
				}
			}
			result.add(new ArrayList<Integer>(temp));
		}
		return result;
	}
}
