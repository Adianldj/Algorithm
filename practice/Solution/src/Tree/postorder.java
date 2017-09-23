package Tree;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;



public class postorder{
	public List<Integer> post(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		if(root == null){
			return result;
		}
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		TreeNode prev = null;
		stack.offerFirst(root);
		while(!stack.isEmpty()){
			TreeNode cur = stack.peekFirst();
			if(prev == null || prev.left == cur || prev.right == cur){
				if(cur.left != null){
					stack.offerFirst(cur.left);
				}else if(cur.right != null){
					stack.offerFirst(cur.right);
				}else{
					result.add(cur.key);
					stack.pollFirst();
				}
			}else if(cur.right == prev || cur.left == prev && cur.right ==null){
				result.add(cur.key);
				stack.pollFirst();
			}else{
				stack.offerFirst(cur.right);
			}
			prev =cur;
		}
		return result;
	}
	public static void main(String[] args){
		TreeNode root = build();
		print(root);
		postorder solution = new postorder();
		List<Integer> result;
		result = solution.post(root);
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
