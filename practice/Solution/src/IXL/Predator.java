package IXL;

public class Predator {
	public int maxLine(int[] data){
		int max_depth = 0;
		boolean[] visited = new boolean[data.length];
		for(int i = 0 ; i < data.length ; i++){
			if(visited[i]){
				continue;
			}
			visited[i] =true;
			int cur_depth = 1;
			int j = data[i];
			while(j != -1){
				cur_depth++;
				visited[j] = true;
				j = data[j];
			}
			max_depth = Math.max(max_depth, cur_depth);
		}
		return max_depth;
	}
	public static void main(String[] args) {
		Predator solution = new Predator();
       
        int result;
        int[] array = new int[]{2 , 4 ,3 , 6 , 2 , 3 , -1};
        result = solution.maxLine(array);
        System.out.println(result);
        
        

	}
	
	
}
