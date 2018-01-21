package BloombergOnsite;

import java.util.ArrayList;
import java.util.List;

public class Number {
	public List<Integer> dfs(NewNode head , int length){
		List<Integer> result = new ArrayList<Integer>();
		if(head == null){
			return result;
		}
		StringBuilder sb = new StringBuilder();
		helper(head , result , 0 , length , sb);
		return result;
	}
	private void helper(NewNode node , List<Integer> result , int index, int length , StringBuilder sb){
		if(index == length){
			result.add(Integer.valueOf(sb.toString()));
			return;
		}
		if(node == null){
			return;
		}
		if(node.val != -1){
			sb.append(node.val + "");
		}
		if(node.val == -1){
			return;
		}
		int num = node.val;
		node.val = -1;
		helper(node.left , result  , index + 1 , length , sb);
		helper(node.right , result , index + 1 , length , sb);
		helper(node.up , result , index + 1 , length , sb);
		helper(node.down , result , index + 1 , length , sb);
		node.val = num;
		
	}
}
