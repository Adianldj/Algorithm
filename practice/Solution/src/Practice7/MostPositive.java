package Practice7;

import java.util.Arrays;
import java.util.Comparator;

public class MostPositive {
	public int count(Point[] points){
		Arrays.sort(points , new MyComparator());
		int result = 0;
		int[] longest = new int[points.length];
		for(int i = 0 ; i < points.length ; i++){
			for(int j = 0 ; j < i ; j ++){
				if(points[j].x < points[i].x  && points[j].y < points[i].y){
					longest[i] = Math.max(longest[i], longest[j]);
				}
			}
			longest[i]++;
			result = Math.max(result, longest[i]);
		}
		return result == 1 ? 0 : result;
		
		
		
	}
	static class MyComparator implements Comparator<Point>{
		@Override
		public int compare(Point p1 , Point p2){
			if(p1.y < p2.y){
				return -1;
			}else if (p1.y > p2.y){
				return 1;
			}else if(p1.x < p2.x){
				return -1;
			}else if(p1.x > p2.x){
				return 1;
			}
			return 0;
		}
	}
}
