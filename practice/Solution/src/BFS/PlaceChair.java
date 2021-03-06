package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PlaceChair {
	private static final char EQUIP = 'E';
	private static final char OB = 'O';
	public List<Integer> place(char[][] gym){
		
		int n = gym.length;
		int m = gym[0].length;
		int[][] cost = new int[n][m];
		for(int i = 0  ; i < n ; i++){
			for(int j = 0 ; j < m ; j++){
				if(gym[i][j] == EQUIP){
					if(!addCost(gym , cost , i , j)){
						return null;
					}
				}
			}
		}
		List<Integer> result = null;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (EQUIP != gym[i][j] && OB != gym[i][j]) {
					if (result == null) {
						result = Arrays.asList(i, j);
					} else if (cost[i][j] <= cost[result.get(0)][result.get(1)]) {
						result.set(0, i);
						result.set(1, j);
					}
				}
			}
		}
		return result;
	}
	private boolean addCost(char[][] gym , int[][] cost , int i , int j){
		int pathcost = 1;
		Queue<Pair> queue = new LinkedList<Pair>();
		queue.offer(new Pair(i , j));
		boolean[][] visited = new boolean[gym.length][gym[0].length];
		visited[i][j] = true;
		while(!queue.isEmpty()){
			int size = queue.size();
			for(int z = 0 ; z < size ; z++){
				Pair cur = queue.poll();
				List<Pair> neis = getNeis(cur , gym);
				for(Pair nei : neis){
					if(!visited[nei.i][nei.j]){
					visited[nei.i][nei.j] = true;
					cost[nei.i][nei.j] += pathcost;
					queue.offer(nei);
					}
				}
				
			}
			pathcost++;
			
		}
		for(int l = 0 ; l < gym.length ; l++){
			for(int k = 0 ; k < gym[0].length ; k++){
			if(!visited[l][k] && gym[l][k] == EQUIP){
				return false;
			}
			}
		}
		return true;
	}
	private List<Pair> getNeis(Pair cur , char[][] gym){
		List<Pair> neigh = new ArrayList<>();
		int x = cur.i;
		int y = cur.j;
		if(x + 1 < gym.length && OB != gym[x + 1][y]){
			neigh.add(new Pair(x + 1 , y));
		}
		if(y + 1 < gym[0].length && OB != gym[x][y + 1]){
			neigh.add(new Pair(x , y + 1));
		}
		if(y - 1 >= 0 && OB != gym[x][y - 1]){
			neigh.add(new Pair(x , y - 1));
		}
		if(x - 1 >= 0 && OB != gym[x - 1][y]){
			neigh.add(new Pair(x - 1 , y));
		}
		return neigh;
	}
	static class Pair{
		int i;
		int j;
		public Pair(int i , int j){
			this.i = i;
			this.j = j;
		}
	}
}
