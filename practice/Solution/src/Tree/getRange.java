package Tree;

import java.util.ArrayList;
import java.util.List;

public class getRange {
	public List<Integer> getrange(TreeNode root , int min , int max){
		List<Integer> result = new ArrayList<Integer>();
		get(root , min , max , result);
		return result;
	}
	public void get(TreeNode root , int min , int max , List<Integer> result){
		if(root == null){
			return;
		}
		if(root.key > min){
			get(root.left , min , max , result);
		}
		if(root.key >= min && root.key <= max){
			result.add(root.key);
		}
		if(root.key < max){
			get(root.right , min , max , result);
		}
		
	}
	public static void main(String[] args){
		TreeNode root = build();
		print(root);
		getRange solution = new getRange();
		List<Integer> result;
		result = solution.getrange(root , 4 , 5);
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
