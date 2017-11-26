package MicrosoftOnsite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequent {
	public List<Integer> topK(int[] nums , int k){
		List<Integer> result = new ArrayList<Integer>();
		Map<Integer , Integer> map = new HashMap<Integer , Integer>();
		for(int i = 0 ; i < nums.length ; i++){
			if(map.containsKey(nums[i])){
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i] , 1);
			}
		}
		PriorityQueue<Map.Entry<Integer , Integer>> maxHeap = new PriorityQueue<Map.Entry<Integer , Integer>>(k , new MyComparator());
		for(Map.Entry<Integer , Integer> entry : map.entrySet()){
			maxHeap.offer(entry);
		}
		while(result.size() < k){
			result.add(maxHeap.poll().getKey());
		}
		return result;
		
	}
	private static class MyComparator implements Comparator<Map.Entry<Integer , Integer>>{
		@Override
		public int compare(Map.Entry<Integer , Integer> s1 , Map.Entry<Integer, Integer> s2){
			if(s1.getValue() == s2.getValue()){
				return 0;
			}
			return s1.getValue() < s2.getValue() ? 1 : -1;
		}
	}
}
