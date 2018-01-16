package Bloomberg;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class printPaths {
	List<List<Integer>> getAllPaths(int u, int v){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(u == v){
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(u);
			result.add(temp);
			return result;
		}
		Set<Integer> visited = new HashSet<Integer>();;
		Deque<Integer> path = new ArrayDeque<Integer>();
		getAllPathsDFS(u, v, visited, path, result);
		return result;
	}
	
	void getAllPathsDFS(int u, int v, Set<Integer> visited, Deque<Integer> path, List<List<Integer>> result){
		visited.add(u); // Mark visited
		path.add(u); // Add to the end
		if(u == v){
			result.add(new ArrayList<Integer>(path));
		}
//		else{
//			//if(adj.containsKey(u)){
//				//for(Integer i : adj.get(u)){
////					if(!visited[i]){
////						getAllPathsDFS(i, v, visited, path, result);
////					}
//				}
//			}
//		}
		path.removeLast();
		visited.remove(u);
	}
}

