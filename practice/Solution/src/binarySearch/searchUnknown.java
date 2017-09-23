package binarySearch;



public class searchUnknown {
	interface Dictionary {
		    public Integer get(int index);
	 }
		public int search(Dictionary dict , int target){
			if(dict == null){
				return -1;
			}
			int left = 0 , right = 1;
			while(dict.get(right) != null && dict.get(right) < target){
				left = right;
				right = right * 2;
			}
			 return binarySearch(dict , left , right , target);
		}
		public int binarySearch(Dictionary dict , int left , int right , int target){
			while(left <= right){
				int mid = left + (right - left) / 2;
				if(dict.get(mid) == null || dict.get(mid) > target){
					right = mid - 1;
				}else if(dict.get(mid) < target){
					left = mid + 1;
				}else{
					return mid;
				}
			}
			return -1;
		}
}
