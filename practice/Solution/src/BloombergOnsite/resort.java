package BloombergOnsite;

import java.util.Stack;

public class resort {
	public void resort(int[] nums){
		if(nums == null || nums.length == 0){
			return;
		}
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(nums[0]);
		for(int i = 1 ; i < nums.length ; i++){
			int next = nums[i];
			if(!stack.isEmpty()){
				int element = stack.pop();
				while(element < next){
					System.out.println(element + "->" + next);
					if(stack.isEmpty()){
						break;
					}
					element = stack.pop();
				}
				if(element > next){
					stack.push(element);
				}
			} 
				stack.push(next);
			
		}
		while(!stack.isEmpty()){
			int next = -1;
			int element = stack.pop();
			System.out.println(element + "->" + next);
		}
		
	}
}
