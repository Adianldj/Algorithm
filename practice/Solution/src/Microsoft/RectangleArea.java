package Microsoft;

public class RectangleArea {
	public int computeArea(int A , int B , int C , int D , int E , int F , int G , int H){
		int innerleft = Math.max(A, E);
		int innerright = Math.max(innerleft, Math.min(C, G));
		int innerbottom = Math.max(B , F);
		int innerup = Math.max(innerbottom, Math.min(D , H));
		return (C - A) * (D - B) + (G - E) * (H - F) - (innerup - innerbottom) * (innerright - innerleft);
	}
}
