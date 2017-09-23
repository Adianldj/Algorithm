package BFS;

import java.util.LinkedList;
import java.util.Queue;


import Tree.TreeNode;

public class isCompleteTree {
		public boolean isComplete(TreeNode root){
			if(root == null){
				return true;
			}
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.offer(root);
			boolean flag = false;
			while(!queue.isEmpty()){
				TreeNode cur = queue.poll();
				if(cur.left == null){
					flag = true;
				}else if(flag){
					return false;
				}else{
					queue.offer(cur.left);
				}
			
					if(cur.right == null){
						flag = true;
					}else if(flag){
						return false;
					}else{
						queue.offer(cur.right);
					}
				
			}
			return true;
		}
		public static void main(String[] args){
			TreeNode root = build();
			print(root);
		    isCompleteTree solution = new isCompleteTree();
			boolean result = false;
			result = solution.isComplete(root);
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
