package PhoneIXL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeInterval {
	public List<Interval> merge(List<Interval> intervals){
//		List<Interval> result = new ArrayList<Interval>();
//		int[] start = new int[intervals.size()];
//		int[] end = new int[intervals.size()];
//		for(int i = 0 ; i < intervals.size() ; i++){
//			start[i] = intervals.get(i).start;
//			end[i] = intervals.get(i).end;
//		}
//		Arrays.sort(start);
//		Arrays.sort(end);
//		for(int i = 0 , j = 0 ; i < start.length ; i++){
//			if(i == start.length - 1 || start[i + 1] > end[i]){
//				result.add(new Interval(start[j] , end[i]));
//				j = i + 1;
//			}
//		}
//		return result;
//		
//	}
		 if (intervals.size() <= 1)
		        return intervals;
		    
		    // Sort by ascending starting point using an anonymous Comparator
		    intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
		    
		    List<Interval> result = new LinkedList<Interval>();
		    int start = intervals.get(0).start;
		    int end = intervals.get(0).end;
		    
		    for (Interval interval : intervals) {
		        if (interval.start <= end) // Overlapping intervals, move the end if needed
		            end = Math.max(end, interval.end);
		        else {                     // Disjoint intervals, add the previous one and reset bounds
		            result.add(new Interval(start, end));
		            start = interval.start;
		            end = interval.end;
		        }
		    }
		    
		    // Add the last interval
		    result.add(new Interval(start, end));
		    return result;
	}

}
//Time: o(nlgn)
//Space:o(n)
