package Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Inorder {
		public  List<Integer> inorder(TreeNode root){
			List<Integer> result = new ArrayList<Integer>();
			Deque<TreeNode> stack = new LinkedList<TreeNode>();
			if(root == null){
				return result;
			}
			TreeNode cur = root;
			while(cur != null || !stack.isEmpty()){
				if(cur != null){
					stack.offerFirst(cur);
					cur = cur.left;
				}else{
					cur = stack.pollFirst();
					result.add(cur.key);
					cur = cur.right;
				}
			}
			return result;
		}
		
		public static void main(String[] args){
			TreeNode root = build();
			print(root);
			Inorder solution = new Inorder();
			List<Integer> result;
			result = solution.inorder(root);
			for(int i = 0 ; i < result.size() ; i++){
				System.out.println(result.get(i).toString());
			}
			
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
			int input[] = {5 ,2 , 1 , 3 , 8};
			TreeNode res = null;
			for(int i = 0 ; i < input.length ; i++){
				res = insert(input[i] , res);
			}
			return res;
		}
		
		
}
