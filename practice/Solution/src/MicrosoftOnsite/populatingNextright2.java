package MicrosoftOnsite;

public class populatingNextright2 {
	 public void connect(TreeLinkNode root) {
//	       TreeLinkNode tempNode = new TreeLinkNode(0);
//	        while(root != null){
//	            TreeLinkNode cur = tempNode;
//	            while(root != null){
//	                if(root.left != null){
//	                    cur.next = root.left;
//	                    cur = cur.next;
//	                }
//	                if(root.right != null){
//	                    cur.next = root.right;
//	                    cur = cur.next;
//	                }
//	                root = root.next;
//	            }
//	            root = tempNode.next;
//	            tempNode.next = null;
//	        }
		 TreeLinkNode tempNode = new TreeLinkNode(0);
		 while(root != null){
			 TreeLinkNode cur = tempNode;
			 while(root != null){
				 if(root.left != null){
					 cur.next = root.left;
					 cur = cur.next;
				 }
				 if(root.right != null){
					 cur.next = root.right;
					 cur = cur.next;
				 }
				 root = root.next;
			 }
			 root = tempNode.next;
			 tempNode.next = null;
		 }
	    }
}
