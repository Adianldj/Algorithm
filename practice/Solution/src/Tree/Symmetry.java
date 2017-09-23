package Tree;




public class Symmetry {
		public boolean isSym(TreeNode root){
			if(root == null){
				return true;
			}
			
			return Syn(root.left , root.right);
		}
		public boolean Syn(TreeNode one , TreeNode two){
			if(one == null && two == null){
				return true;
			}else if(one == null || two == null){
				return false;
			}else if(one.key != two.key){
				return false;
			}
			return Syn(one.left , two.right) && Syn(one.right , two.left);
		}
		public static void main(String[] args){
			TreeNode root = build();
			print(root);
			Symmetry solution = new Symmetry();
			boolean result;
			result = solution.isSym(root);
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
			int input[] = {5 ,2 , 1 , 3 , 8};
			TreeNode res = null;
			for(int i = 0 ; i < input.length ; i++){
				res = insert(input[i] , res);
			}
			return res;
		}
}
