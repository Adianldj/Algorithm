package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Tree.TreeNode;

public class levelOrder {
		public List<List<Integer>> level(TreeNode root){
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
				result.add(temp);
				
			}
			return result;
		}
		public static void main(String[] args){
			TreeNode root = build();
			print(root);
		    levelOrder solution = new levelOrder();
			List<List<Integer>> result;
			result = solution.level(root);
			
			System.out.print(result);
		}
		private static void print(TreeNode root){
			if(root == null){
				return;
			}
			System.out.print(root.key + "->(");
			if(root.left != null){
				System.out.print(root.left.key);
			}else{
				System.out.print("^");
			}
			System.out.print(",");
			
			if(root.right != null){
				System.out.print(root.right.key);
			}else{
				System.out.print("^");
			}
			System.out.println(")");
			print(root.left);
			print(root.right);
		}
		private static TreeNode insert(int val , TreeNode root){
			if(root == null){
				return new TreeNode(val);}
				if(val > root.key){
					root.right = insert(val , root.right);
					
				}else{
					root.left = insert(val , root.left);
				}
				return root;
		}
		
		public static TreeNode build(){
			int input[] = {5 ,2 , 4 , 3 , 8};
			TreeNode res = null;
			for(int i = 0 ; i < input.length ; i++){
				res = insert(input[i] , res);
			}
			return res;
		}
}
