package Tree;



public class balance {
		public boolean isBalanced(TreeNode root){
			if(root == null){
				return true;
			}
			int left = getHeight(root.left);
			int right = getHeight(root.right);
			
			if(Math.abs(left - right) > 1){
				return false;
			}
			return isBalanced(root.left) && isBalanced(root.right);
			
			
			
		}
		public int getHeight(TreeNode root){
			if(root == null){
				return 0;
			}
			int left = getHeight(root.left);
			int right = getHeight(root.right);
			return Math.max(left , right) + 1;
		}
		public static void main(String[] args){
			TreeNode root = build();
			print(root);
			balance solution = new balance();
			boolean result;
			result = solution.isBalanced(root);
			System.out.println(result);
			
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
