package MicrosoftOnsite;

import java.util.ArrayList;
import java.util.List;

import Tree.TreeNode;

public class MergeBST {
	public TreeNode mergeTrees(TreeNode root1 , TreeNode root2){
		List<Integer> list1 = storeInorder(root1);
		List<Integer> list2 = storeInorder(root2);
		List<Integer> list3 = merge(list1 , list2 , list1.size() , list2.size());
		TreeNode result = ListToBST(list3 , 0 , list3.size() - 1);
		return result;
	}
	private List<Integer> storeInorder(TreeNode root){
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = storeInorderUtil(list1 , root);
		return list2;
	}
	private List<Integer> storeInorderUtil(List<Integer> list , TreeNode root){
		if(root == null){
			return list;
		}
		storeInorderUtil(list , root.left);
		list.add(root.key);
		storeInorderUtil(list , root.right);
		return list;
	}
	private List<Integer> merge(List<Integer> list1 , List<Integer> list2 , int size1 , int size2){
		List<Integer> list3 = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while(i < size1 && j < size2){
			if(list1.get(i) < list2.get(j)){
				list3.add(list1.get(i));
				i++;
			} else {
				list3.add(list2.get(j));
				j++;
			}
			
		}
		while(i < size1){
			list3.add(list1.get(i));
			i++;
		}
		while(j < size2){
			list3.add(list1.get(j));
			j++;
		}
		return list3;
		
		
	}
	private TreeNode ListToBST(List<Integer> list , int start , int end){
		if(start > end){
			return null;
		}
		int mid = start + (end - start) / 2;
		TreeNode root = new TreeNode(list.get(mid));
		root.left = ListToBST(list , start , mid - 1);
		root.right = ListToBST(list , mid + 1 , end);
		return root;
		
	}
	
}
