package MicrosoftOnsite;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import Tree.TreeNode;

public class Serialization {
	 private static final String spliter = ",";
	    private static final String NN = "X";
	    // Encodes a tree to a single string.
	    public String serialize(TreeNode root) {
	        StringBuilder sb = new StringBuilder();
	        buildString(root , sb);
	        return sb.toString();
	    }
	    private void buildString(TreeNode root , StringBuilder sb){
	        if(root == null){
	            sb.append(NN).append(spliter);
	        } else {
	            sb.append(root.key).append(spliter);
	            buildString(root.left , sb);
	            buildString(root.right , sb);
	        }
	    }
	    
	    // Decodes your encoded data to tree.
	    public TreeNode deserialize(String data) {
	        Deque<String> nodes = new LinkedList<String>();
	        nodes.addAll(Arrays.asList(data.split(spliter)));
	        return buildTree(nodes);
	    }
	    private TreeNode buildTree(Deque<String> nodes){
	        String val = nodes.remove();
	        if(val.equals(NN)){
	            return null;
	        } else {
	            TreeNode root = new TreeNode(Integer.valueOf(val));
	            root.left = buildTree(nodes);
	            root.right = buildTree(nodes);
	            return root;
	        }

	    }
	}

