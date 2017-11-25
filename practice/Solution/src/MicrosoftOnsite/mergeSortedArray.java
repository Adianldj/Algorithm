package MicrosoftOnsite;

public class mergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int mindex = m - 1;
        int nindex = n - 1;
        while(mindex >= 0 && nindex >= 0){
            if(nums1[mindex] > nums2[nindex]){
                nums1[index--] = nums1[mindex--];
            } else {
                nums1[index--] = nums2[nindex--];
            }
        }
        while(nindex >= 0){
            nums1[index--] = nums2[nindex--];
        }
    }
}
