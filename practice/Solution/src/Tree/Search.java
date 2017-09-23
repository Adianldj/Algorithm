package Tree;

public class Search {
	public TreeNode search(TreeNode root, int key) {
		if (root == null) {
			return root;
		}
		while (root != null) {
			if (root.key == key) {
				return root;
			} else if (root.key < key) {
				if (root.right == null) {
					break;
				} else {
					root = root.right;
					continue;
				}
			} else if (root.key > key) {
				if (root.left == null) {
					break;
				} else {
					root = root.left;
					continue;
				}
			}
		}
		return null;
	}
	public static void main(String[] args){
		TreeNode root = build();
		print(root);
		Search solution = new Search();
		TreeNode result;
		result = solution.search(root , 5);
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
