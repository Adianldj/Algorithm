package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReconstructLevelorder {
	public TreeNode rebuild(int[] in , int[] level){
		Map<Integer , Integer> map = buildMap(in);
		List<Integer> list = new ArrayList<Integer>();
		for(int n : level){
			list.add(n);
		}
		return build(map , list);
	}
	private Map<Integer , Integer> buildMap(int[] in){
		Map<Integer , Integer> map = new HashMap<>();
		for(int i = 0 ; i < in.length ; i++){
			map.put(in[i] , i);
		}
		return map;
	}
	private TreeNode build(Map<Integer , Integer> map , List<Integer> list){
		if(list.isEmpty()){
			return null;
		}
		TreeNode root = new TreeNode(list.remove(0));
		int index = map.get(root.key);
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		for(int node : list){
			if(map.get(node) < index){
				left.add(node);
			}else if(map.get(node) > index){
				right.add(node);
			}
		}
		root.left = build(map , left);
		root.right = build(map , right);
		return root;
	}
}
