package MicrosoftOnsite;

public class rightPointerTree {
	 public void connect(TreeLinkNode root) {
	        if(root == null){
	            return;
	        }
	        root.next = null;
	        while(root != null && root.left != null){
	            TreeLinkNode cur = root;
	            cur.left.next = cur.right;
	            while(cur.next != null){
	                cur.right.next = cur.next.left;
	                cur.next.left.next = cur.next.right;
	                cur = cur.next;
	            }
	            cur.right.next = null;
	            root = root.left;
	        }
	    }
}
class TreeLinkNode {
	    int val;
	    TreeLinkNode left, right, next;
	TreeLinkNode(int x) { val = x; }
}
