package BloombergOnsite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class deepCopy {
	public List<GraphNode> copy(List<GraphNode> graph){
		 if(graph == null){
		        return graph;
		      }
		      Map<GraphNode , GraphNode> map = new HashMap<GraphNode , GraphNode>();
		      for(GraphNode node : graph){
		        if(!map.containsKey(node)){
		          map.put(node , new GraphNode(node.key));
		        }
		        DFS(node , map);
		      }
		      return new ArrayList<GraphNode>(map.values());
		  }
		  private void DFS(GraphNode node , Map<GraphNode , GraphNode> map){
		    GraphNode copy = map.get(node);
		    for(GraphNode nei : node.neighbors){
		      if(!map.containsKey(nei)){
		        map.put(nei , new GraphNode(nei.key));
		        DFS(nei  , map);
		      }
		      copy.neighbors.add(map.get(nei));
		    }
	}
}
