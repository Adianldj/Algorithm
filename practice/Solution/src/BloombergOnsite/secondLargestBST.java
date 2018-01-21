package BloombergOnsite;

import Tree.TreeNode;

public class secondLargestBST {
	private int second(TreeNode root){
		if(root == null){
			return -1;
		}
		int secondMax;
		TreeNode pre = root;
		TreeNode cur = root;
		while(cur.right != null){
			pre = cur;
			cur = cur.right;
		}
		if(cur.left != null){
			cur = cur.left;
			while(cur.right != null){
				cur = cur.right;
			}
			secondMax = cur.key;
		} else {
			if(cur == root && pre == root){
				secondMax = Integer.MIN_VALUE;
			} else {
				secondMax = pre.key;
			}
		}
		return secondMax;
//		void secondLargestUtil(Node *root, int &c)
//		{
//		    // Base cases, the second condition is important to
//		    // avoid unnecessary recursive calls
//		    if (root == NULL || c >= 2)
//		        return;
//		 
//		    // Follow reverse inorder traversal so that the
//		    // largest element is visited first
//		    secondLargestUtil(root->right, c);
//		 
//		    // Increment count of visited nodes
//		    c++;
//		 
//		    // If c becomes k now, then this is the 2nd largest
//		    if (c == 2)
//		    {
//		        cout << "2nd largest element is "
//		             << root->key << endl;
//		        return;
//		    }
//		 
//		    // Recur for left subtree
//		    secondLargestUtil(root->left, c);
//		}
	}
}
