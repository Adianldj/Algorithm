package PhoneIXL;

import java.util.Arrays;

import recursion2.TreeNode;

public class btToBST {
	public TreeNode binaryTreeToBST (TreeNode root)
	{
	    // base case: tree is empty
	    if(root == null)
	       return null;
	 
	    /* Count the number of nodes in Binary Tree so that
	       we know the size of temporary array to be created */
	    int n = countNodes (root);//o(n)
	 
	    // Create a temp array arr[] and store inorder traversal of tree in arr[]
	    int[] array = new int[n];
	    int i = 0;
	    storeInorder (root, array, i);
	    // Sort the array using library function for quick sort
	    Arrays.sort(array);//o(nlgn)
	    // Copy array elements back to Binary Tree
	    i = 0;
	    return arrayToBST (array, root, i);
	}
	private int countNodes(TreeNode root){
		if (root == null){
		     return 0;
		}
		return countNodes (root.left) + countNodes (root.right) + 1;
	}
	private void storeInorder (TreeNode root, int inorder[], int index)
	{
	    // Base Case
	    if (root == null)
	        return;
	 
	    /* first store the left subtree */
	    storeInorder (root.left, inorder, index);
	 
	    /* Copy the root's data */
	    inorder[index] = root.key;
	    index++;  // increase index for next entry
	 
	    /* finally store the right subtree */
	    storeInorder (root.right, inorder, index);
	}
	private TreeNode arrayToBST (int[] array, TreeNode root, int index)
	{
	    // Base Case
	    if (root == null)
	      return root;
	 
	    /* first update the left subtree */
	    arrayToBST (array, root.left, index);
	 
	    /* Now update root's data and increment index */
	    root.key = array[index];
	    index++;
	 
	    /* finally update the right subtree */
	    arrayToBST (array, root.right, index);
	    return root;
	}
	
	
}
//time:o(nlogn);
//space:o(n)