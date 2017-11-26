package MicrosoftOnsite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Tree.TreeNode;

public class ZigZag {
	 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if(root == null){
	            return result;
	        }
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.offer(root);
	        int flag = 0;
	        while(!queue.isEmpty()){
	            int size = queue.size();
	            List<Integer> temp = new ArrayList<Integer>();
	            for(int i = 0 ; i < size ; i++){
	                TreeNode cur = queue.poll();
	                if(flag == 0){
	                    temp.add(cur.key);
	                }
	                if(flag == 1){
	                    temp.add(0 , cur.key);
	                }
	                if(cur.left != null){
	                    queue.offer(cur.left);
	                }
	                if(cur.right != null){
	                    queue.offer(cur.right);
	                }
	            }
	            flag = 1 - flag;
	            result.add(new ArrayList<Integer>(temp));
	        }
	        return result;
	    }
}
