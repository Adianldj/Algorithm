package Practice7;

import java.util.HashMap;
import java.util.Map;

public class MostPoint {
	public int mostpoint(Point[] points){
		int result = 0;
		for(int i = 0 ; i < points.length ; i++){
			Point seed = points[i];
			int same = 1;
			int samex = 0;
			int most = 0;
			Map<Double , Integer> map = new HashMap<Double , Integer>();
			for(int j = 0 ; j < points.length ; j++){
				Point temp = points[j];
				if(i == j){
					continue;
				}else if(temp.x == seed.x && temp.y == seed.y){
					same++;
				}else if(temp.x == seed.x){
					same++;
				}else{
					Double k = (seed.y - temp.y + 0.0) / (seed.x - temp.x);
					if(!map.containsKey(k)){
						map.put(k , 1);
					}else{
						map.put(k , map.get(k) + 1);
					}
					most = Math.max(most , map.get(k));
				}
			
			}
			int max = Math.max(samex , most) + same;
			result = Math.max(max , result);
		}
		return result;
	}
}
