package String;




import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKWords {
		
			public String[] topKFrequent(String[] combo, int k) {
			    // Write your solution here.
			    if(combo == null || combo.length == 0){
			      return combo;
			    }
			    Map<String , Integer> map = getMap(combo);
			    PriorityQueue<Map.Entry<String , Integer>> minHeap = new PriorityQueue<Map.Entry<String , Integer>>(k , new MyComparator());
			    for(Map.Entry<String , Integer> entry :map.entrySet()){
			      if(minHeap.size() < k){
			        minHeap.offer(entry);
			      } else if(minHeap.peek().getValue() < entry.getValue()){
			        minHeap.poll();
			        minHeap.offer(entry);
			      }
			    }
			    String[] result = new String[k];
			    for(int i = result.length - 1 ; i >= 0 ; i--){
			      result[i] = minHeap.poll().getKey();
			    }
			    return result;
			  }
			  public static class MyComparator implements Comparator<Map.Entry<String , Integer>>{
			    @Override
			    public int compare(Map.Entry<String , Integer> o1 , Map.Entry<String , Integer> o2){
			      if(o1.getValue() == o2.getValue()){
			        return 0;
			      }
			      return o1.getValue() < o2.getValue() ? -1 : 1;
			    }
			  }
			  private Map<String , Integer> getMap(String[] combo){
			    Map<String , Integer> map = new HashMap<String , Integer>();
			    for(String m : combo){
			      if(!map.containsKey(m)){
			        map.put(m , 1);
			      } else {
			        map.put(m , map.get(m) + 1);
			      }
			    }
			    return map;
			  }
		

		public static void main(String[] args) {
			topKWords solution = new topKWords();
            String[] array = new String[]{"d","a","c","b","d","a","b","b","a","d","d","a","d"};
			int k = 3;
            String[] result = new String[k];
			result = solution.topKFrequent(array , k);
			for(int i = 0 ; i < result.length ; i++){
				System.out.println(result[i]);
			}
			

			

		}
}

