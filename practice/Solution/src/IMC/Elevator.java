package IMC;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Elevator {
	public int solution(int[] A , int[] B , int M , int X , int Y){
		int totalStops = 0;
		long totalWeighPerRound = 0;
		int maxPersonsCount = 0;
		List<Integer> floor = new ArrayList<>();
		
		int currPerson = 0;
		boolean startLift = false;
		while(currPerson < A.length){
			if((totalWeighPerRound + A[currPerson] <= Y) && (maxPersonsCount + 1) <= X){
				totalWeighPerRound += A[currPerson];
				maxPersonsCount++;
				floor.add(B[currPerson]);
				if(currPerson == A.length - 1){
					startLift = true;
				}
				currPerson++;
			}else{
				startLift = true;
			}
			if(startLift){
				Set<Integer> set = new HashSet<>();
				for(int i :floor){
					set.add(i);
				}
				totalStops += set.size() + 1;
				floor = new ArrayList<>();
				maxPersonsCount = 0;
				totalWeighPerRound = 0;
				startLift = false;
			}
		}
		return totalStops;
	}
}
