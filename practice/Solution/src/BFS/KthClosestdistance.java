//package BFS;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Set;
//
//public class KthClosestdistance {
//	public List<Integer> closest(int[] a , int[] b , int[] c , int k){
//		 PriorityQueue<List<Integer>> minHeap = new PriorityQueue<>(2 * k , new Compar<List<Integer>>(){
//		      @Override
//		      public int compare(List<Integer> o1 , List<Integer> o2){
//		        long distance1 = getDistance(o1 , a, b ,c);
//		        long distance2 = getDistance(o2 , a ,b ,c);
//		        if(distance1 == distance2){
//		          return 0;
//		        }
//		        return distance1 < distance2 ? -1 : 1;
//		      }
//		      
//		    });
//		    Set<List<Integer>> visited = new HashSet<>();
//		    List<Integer> cur = Arrays.asList(0 , 0 , 0);
//		    visited.add(cur);
//		    minHeap.offer(cur);
//		    while(k > 0){
//		      cur = minHeap.poll();
//		      List<Integer> n = Arrays.asList(cur.get(0) + 1 , cur.get(1) , cur.get(2));
//		      if(n.get(0) < a.length && visited.add(n)){
//		        minHeap.offer(n);
//		      }
//		      n = Arrays.asList(cur.get(0) , cur.get(1) + 1 , cur.get(2));
//		      if(n.get(1) < b.length && visited.add(n)){
//		        minHeap.offer(n);
//		      }
//		       n = Arrays.asList(cur.get(0) , cur.get(1), cur.get(2) + 1);
//		      if(n.get(2) < c.length && visited.add(n)){
//		        minHeap.offer(n);
//		      }
//		      k--;
//		    }
//		    cur.set(0 , a[cur.get(0)]);
//		    cur.set(1 , b[cur.get(1)]);
//		    cur.set(2 , c[cur.get(2)]);
//		    return cur;
//		    
//		  }
//		  private long getDistance(List<Integer> point , int[] a , int[] b , int[] c){
//		     long distance = 0;
//		     distance += a[point.get(0)] * a[point.get(0)];
//		     distance += b[point.get(1)] * b[point.get(1)];
//		     distance += c[point.get(2)] * c[point.get(2)];
//		     return distance;
//		  }
	

