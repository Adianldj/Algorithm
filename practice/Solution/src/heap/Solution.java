package heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String , Integer> map = new HashMap<String , Integer>();
        for(int i = 0 ; i < words.length ; i++){
            if(!map.containsKey(words[i])){
                map.put(words[i] , 1);
            } else {
                map.put(words[i] , map.get(words[i]) + 1);
            }
        }
        PriorityQueue<Map.Entry<String , Integer>> pq = new PriorityQueue<Map.Entry<String , Integer>>(k , new MyComparator());
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            pq.offer(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }
        List<String> result = new ArrayList<String>();
        while(!pq.isEmpty()){
            result.add(0 , pq.poll().getKey());
        }
        return result;
    }
    private static class MyComparator implements Comparator<Map.Entry<String , Integer>>{
        @Override
        public int compare(Map.Entry<String , Integer> e1 , Map.Entry<String , Integer> e2){
            if(e1.getValue() == e2.getValue()){
                return e2.getKey().compareTo(e1.getKey());
            }
            return e1.getValue() < e2.getValue() ? -1 : 1
        }
    }
}