package PhoneIXL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
	public List<Interval> merge(List<Interval> intervals){
		List<Interval> result = new ArrayList<Interval>();
		int[] start = new int[intervals.size()];
		int[] end = new int[intervals.size()];
		for(int i = 0 ; i < intervals.size() ; i++){
			start[i] = intervals.get(i).start;
			end[i] = intervals.get(i).end;
		}
		Arrays.sort(start);
		Arrays.sort(end);
		for(int i = 0 , j = 0 ; i < start.length ; i++){
			if(i == start.length - 1 || start[i + 1] > end[i]){
				result.add(new Interval(start[j] , end[i]));
				j = i + 1;
			}
		}
		return result;
		
	}
}
