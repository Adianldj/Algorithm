package DP;

public class CuttingWood {
	public int cutting(int[] cuts , int length){
		if(cuts == null || cuts.length == 0 ){
			return 0;
		}
		int len = cuts.length;
		int[] helper = new int[len  + 2];
		for(int i = 1 ; i < helper.length - 1 ; i++){
			helper[i] = cuts[i - 1];
		}
		helper[helper.length - 1] = length;
		int[][] mincost = new int[helper.length][helper.length];
		for(int i = 1 ; i < helper.length ; i++){
			for(int j = i - 1; j >= 0 ; j--){
				if(j + 1 == i){
					mincost[j][i] = 0;
				}else{
					mincost[j][i] = Integer.MAX_VALUE;
					for(int k = j + 1 ; k < i ; k++){
						mincost[j][i] = Math.min(mincost[j][i] , mincost[j][k] + mincost[k][i]);
					}
					mincost[j][i] = mincost[j][i] + helper[i] - helper[j];
				}
			}
			
		}
		return mincost[0][helper.length - 1];
		
	}
}
