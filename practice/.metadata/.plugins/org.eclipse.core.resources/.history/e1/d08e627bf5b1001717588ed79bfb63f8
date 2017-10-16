package Tree;


public class isBST {
	public boolean isbst(TreeNode root){
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		if(root == null){
			return true;
			
		}
		return BST(root , min , max);
	}
	public boolean BST(TreeNode root , int min , int max){
		if(root == null){
			return true;
		}
		if(root.key <= min){
			return false;
		}
		if(root.key >= max){
			return false;
		}
		return BST(root.left , min , root.key) && BST(root.right , root.key , max);
	}
	public static void main(String[] args){
		TreeNode root = build();
		print(root);
		isBST solution = new isBST();
		boolean result;
		result = solution.isbst(root);
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
