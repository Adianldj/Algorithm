package String;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


import Tree.TreeNode;


public class Zigzag {
	public List<Integer> zigzag(TreeNode root) {
		List<Integer> result = new LinkedList<Integer>();
		Deque<TreeNode> deque = new LinkedList<TreeNode>();
		if (root == null) {
			return result;
		}
		deque.offerFirst(root);
		int flag = 0;
		while (!deque.isEmpty()) {
			int size = deque.size();
			for (int i = 0; i < size; i++) {
				if (flag == 0) {
					TreeNode cur = deque.pollLast();
					result.add(cur.key);
					if (cur.right != null) {
						deque.offerFirst(cur.right);
					}
					if (cur.left != null) {
						deque.offerFirst(cur.left);
					}
				} else {
					TreeNode cur = deque.pollFirst();
					result.add(cur.key);

					if (cur.left != null) {
						deque.offerLast(cur.left);
					}
					if (cur.right != null) {
						deque.offerLast(cur.right);
					}
				}
			}
			flag = 1 - flag;
		}
		return result;
	}
	public static void main(String[] args){
		TreeNode root = build();
		print(root);
		Zigzag solution = new Zigzag();
		List<Integer> result;
		result = solution.zigzag(root);
		for(int i = 0 ; i < result.size() ; i++){
			System.out.print(result.get(i));
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
		int input[] = {5 ,2 , 4 , 3 , 8};
		TreeNode res = null;
		for(int i = 0 ; i < input.length ; i++){
			res = insert(input[i] , res);
		}
		return res;
	}
}
