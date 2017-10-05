package Tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TopView {
	public void topView(TreeNode root){
		if(root == null){
			return;
		}
		Queue<Pair> queue = new LinkedList<>();
		Set<Integer> set = new HashSet<>();
		queue.offer(new Pair(root , 0));
		while(!queue.isEmpty()){
			Pair q = queue.poll();
			if(!set.contains(q.breath)){
				set.add(q.breath);
				System.out.println(q.root.key);
			}
			if(q.root.left != null){
				queue.offer(new Pair(q.root.left , q.breath - 1));
			}
			if(q.root.right != null){
				queue.offer(new Pair(q.root.right , q.breath + 1));
			}
		}
		
		
	}
	static class Pair{
		TreeNode root;
		int breath;
		public Pair(TreeNode root , int breadth){
			this.root = root;
			this.breath = breadth;
		}
	}
	public static void main(String[] args){
		TreeNode root = build();
		TopView solution = new TopView();
		solution.topView(root);
		
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
