package Tree;

public class Delete {
	public TreeNode delete(TreeNode root , int key){
		if(root == null){
			return root;
		}
		if(root.key < key){
			root.right = delete(root.right , key);
		}else if(root.key > key){
			root.left = delete(root.left , key);
		}else{
			if(root.left == null && root.right == null){
				root = null;
				return root;
			}else if(root.left == null){
				return root.right;
			}else if(root.right == null){
				return root.left;
			}else{
				TreeNode smallest = findSmallest(root.right);
				root.key = smallest.key;
				root.right = delete(root.right , smallest.key);
			}
		}
		return root;
		
	}
	public TreeNode findSmallest(TreeNode root){
		while(root.left != null){
			root = root.left;
		}
		return root;
	}
	public static void main(String[] args){
		TreeNode root = build();
		print(root);
		System.out.println("aa");
		Delete solution = new Delete();
		TreeNode result;
		result = solution.delete(root , 5);
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
