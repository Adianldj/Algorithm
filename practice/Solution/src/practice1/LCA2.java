package practice1;

public class LCA2 {
	public TreeNodeP LCA(TreeNodeP one , TreeNodeP two){
		int l1 = getlength(one);
		int l2 = getlength(two);
		if(l1 < l2){
			return getLCA(one , two , l2 - l1);
		}else{
			return getLCA(two , one , l1 - l2);
		}
	}
	private int getlength(TreeNodeP one){
		 int length = 0;
		 while(one != null){
			 one = one.parent;
			 length++;
		 }
		 return length;
	}
	private TreeNodeP getLCA(TreeNodeP one , TreeNodeP two , int diff){
		while(diff > 0){
			two = two.parent;
			diff--;
		}
		while(one != two){
			one = one.parent;
			two = two.parent;
		}
		return one;
	}
}
