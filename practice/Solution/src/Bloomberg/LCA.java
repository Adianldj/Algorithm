package Bloomberg;

import java.util.HashMap;
import java.util.Map;

public class LCA {
	class Node 
	{
	    int key;
	    Node left, right, parent;
	 
	    Node(int key) 
	    {
	        this.key = key;
	        left = right = parent = null;
	    }
	}
	 Node LCA(Node n1, Node n2) 
	    {
	        // Creata a map to store ancestors of n1
	        Map<Node, Boolean> ancestors = new HashMap<Node, Boolean>();
	 
	        // Insert n1 and all its ancestors in map
	        while (n1 != null) 
	        {
	            ancestors.put(n1, Boolean.TRUE);
	            n1 = n1.parent;
	        }
	 
	        // Check if n2 or any of its ancestors is in
	        // map.
	        while (n2 != null) 
	        {
	            if (ancestors.containsKey(n2) != ancestors.isEmpty())
	                return n2;
	            n2 = n2.parent;
	        }
	 
	        return null;
	    }
}
