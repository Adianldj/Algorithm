package BloombergOnsite;

import java.util.Arrays;
import java.util.PriorityQueue;

import PhoneIXL.Interval;



public class meetingRoom2 {
	 public int minMeetingRooms(Interval[] intervals) {
         if(intervals == null || intervals.length == 0){
             return 0;
         }
//        Arrays.sort(intervals , new Comparator<Interval>(){
//            @Override
//            public int compare(Interval o1 , Interval o2){
//                return o1.start < o2.start ? -1 : 1;
//            }
//        });
//        PriorityQueue<Interval> minHeap = new PriorityQueue<Interval>(intervals.length , new Comparator<Interval>(){
//           @Override
//            public int compare(Interval o1 , Interval o2){
//                return o1.end < o2.end ? -1 : 1;
//            }
////        });
//        
//        minHeap.offer(intervals[0]);
//        for(int i = 1 ; i < intervals.length ; i++){
//            Interval interval = minHeap.poll();
//            if(interval.end <= intervals[i].start){
//                interval.end = intervals[i].end;
//            } else {
//                minHeap.offer(intervals[i]);
//            }
//            minHeap.offer(interval);
//        }
//        return minHeap.size();
    //}
}
