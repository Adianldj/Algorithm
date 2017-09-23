package Practice7;

public class longestCommonSubstring {
	public String longest(String s , String t){
		char[] sa = s.toCharArray();
		char[] ta = t.toCharArray();
		int max = 0;
		int start = 0;
		int[][] longest = new int[sa.length][ta.length];
		for(int i = 0 ; i < sa.length ; i ++){
			for(int j = 0 ; j < ta.length ; j++){
				if(sa[i] == ta[j]){
					if(i == 0 || j== 0){
						longest[i][j] = 1;
					}else{
						longest[i][j] = longest[i - 1][j - 1] + 1;
					}
					if(longest[i][j] > max){
						max = longest[i][j];
						start = i - max + 1;
					}
				}
			}
		}
		return s.substring(start , start + max - 1);
	}
}
