package Tree;

import java.util.HashMap;
import java.util.Map;

public class ReconstructPreorder {
	public TreeNode rebuild(int[] in , int[] pre){
		Map<Integer , Integer> map = buildMap(in);
		return build(pre , 0 , pre.length - 1 , in , 0 , in.length - 1 , map);
	}
	private TreeNode build(int[] pre , int prestart , int preend , int[] in , int instart , int inend , Map<Integer , Integer> map){
		if(inend < instart){
			return null;
		}
		TreeNode root = new TreeNode(pre[prestart]);
		int index = map.get(root.key);
		root.left = build(pre , prestart + 1 , prestart + index - instart , in , instart , index - 1 , map);
		root.right = build(pre , prestart + index - instart + 1 , preend , in , index + 1 , inend , map);
		return root;
	}
	private Map<Integer , Integer> buildMap(int[] in){
		Map<Integer , Integer> map = new HashMap<Integer , Integer>();
		for(int i = 0 ; i < in.length ; i++){
			map.put(in[i] , i);
		}
		return map;
	}
}
