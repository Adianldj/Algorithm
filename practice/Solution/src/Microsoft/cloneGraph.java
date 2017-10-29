package Microsoft;

import java.util.HashMap;

public class cloneGraph {
	private HashMap<Integer , UndirectedGraphNode> map = new HashMap<>();
	public UndirectedGraphNode copy(UndirectedGraphNode node){
		if(node == null){
			return node;
		}
		if(map.containsKey(node.label)){
			return map.get(node.label);
		}
		UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
		map.put(node.label, clone);
		for(UndirectedGraphNode neighbor : node.neighbors){
			clone.neighbors.add(neighbor);
		}
		return clone;
	}
}
