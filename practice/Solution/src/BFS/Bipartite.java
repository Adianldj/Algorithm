package BFS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Bipartite {
	public boolean bipar(List<GraphNode> graph) {
		//
		Map<GraphNode, Integer> visited = new HashMap<GraphNode, Integer>();
		for (GraphNode node : graph) {
			if (!BFS(node, visited)) {
				return false;
			}
		}
		return true;
	}

	public boolean BFS(GraphNode node, Map<GraphNode, Integer> visited) {
		if (visited.containsKey(node)) {
			return true;
		}
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		queue.offer(node);
		visited.put(node, 0);
		while (!queue.isEmpty()) {
			GraphNode cur = queue.poll();
			int curGroup = visited.get(cur);
			int neiGroup = 1 - curGroup;
			for (GraphNode nei : cur.neighbors) {
				if (!visited.containsKey(nei)) {
					visited.put(nei, neiGroup);
					queue.offer(nei);
				} else if (visited.get(nei) != neiGroup) {
					return false;
				}
			}
		}
		return true;
	}
}
