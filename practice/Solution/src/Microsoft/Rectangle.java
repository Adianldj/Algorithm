package Microsoft;

public class Rectangle {
	public boolean isOverlapping(int A , int B , int C , int D , int E , int F , int G , int H){
		if(A > G || E > C || B < H || F < D){
			return false;
		}
		return true;
	}
}
