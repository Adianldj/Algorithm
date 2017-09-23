package practice6;

//import java.util.Arrays;

public class medianSorted {
	public double median(int[] a, int[] b) {
		int lengthA = a.length;
		int lengthB = b.length;
		//not sorted vs sorted
		//Arrays.sort(a);
		//Arrays.sort(b);
		int l = (lengthA + lengthB + 1) / 2;
		int r = (lengthA + lengthB + 2) / 2;
		return (getKth(a, 0, b, 0, l) + getKth(a, 0, b, 0, r)) / 2.0;
	}

	private double getKth(int[] a, int leftA, int[] b, int leftB, int k) {
		if (leftA >= a.length) {
			return b[leftB + k - 1];
		}
		if (leftB >= b.length) {
			return a[leftA + k - 1];
		}
		if (k == 1) {
			return Math.min(a[leftA], b[leftB]);
		}
		int amid = leftA + k / 2 - 1;
		int bmid = leftB + k / 2 - 1;
		int aval = amid >= a.length ? Integer.MAX_VALUE : a[amid];
		int bval = bmid >= b.length ? Integer.MAX_VALUE : b[bmid];
		if (aval < bval) {
			return getKth(a, leftA + k / 2, b, leftB, k - k / 2);

		} else {
			return getKth(a, leftA, b, leftB + k / 2, k - k / 2);
		}
	}
	public static void main(String[] args) {
		medianSorted solution = new medianSorted();

		int[] array1 = new int[] {4,2,6,4,1,1 };
		int[] array2 = new int[] { 9, 2, 1, 5  , 3};
		double result;

		result = solution.median(array1, array2);
		System.out.println(result);

	}
}
