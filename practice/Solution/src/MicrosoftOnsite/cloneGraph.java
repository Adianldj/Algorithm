package MicrosoftOnsite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cloneGraph {
	Map<Integer , UndirectedGraphNode> map = new HashMap<Integer , UndirectedGraphNode>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return clone(node);
    }
    private UndirectedGraphNode clone(UndirectedGraphNode node){
        if(node == null){
            return node;
        }
        if(map.containsKey(node.label)){
            return map.get(node.label);
        }
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(node.label , clone);
        for(UndirectedGraphNode neighbor : node.neighbors){
            map.get(node.label).neighbors.add(clone(neighbor));
        }
        return clone;
}
}
    class UndirectedGraphNode {
    	     int label;
    	     List<UndirectedGraphNode> neighbors;
    	     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
   }
