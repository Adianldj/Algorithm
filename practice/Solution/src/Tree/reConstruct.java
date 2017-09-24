package Tree;

public class reConstruct {
	public TreeNode recon(int[] post){
		int index = post.length - 1;
		return rebuild(post , index , Integer.MIN_VALUE);
	}
	private TreeNode rebuild(int[] post , int index , int min){
		if(index < 0 || post[index] <= min){
			return null;
		}
		TreeNode root = new TreeNode(post[index--]);
		root.right = rebuild(post , index , root.key);
		root.left = rebuild(post , index , min);
		
		return root;
	}
}
