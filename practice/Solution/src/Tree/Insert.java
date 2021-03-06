package Tree;



public class Insert {
	public TreeNode insert(TreeNode root , int key){
		if(root == null){
			root = new TreeNode(key);
			return root;
		}
		if(root.key < key){
			root.right = insert(root.right , key);
		}else if(root.key > key){
			root.left = insert(root.left , key);
		}
		return root;
	}
	public static void main(String[] args){
		TreeNode root = build();
		print(root);
		Insert solution = new Insert();
		TreeNode result;
		result = solution.insert(root , 4);
		print(result);
		
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
