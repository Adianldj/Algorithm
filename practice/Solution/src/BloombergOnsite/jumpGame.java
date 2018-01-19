package BloombergOnsite;

public class jumpGame {
public int jump(int[] nums) {
       
        
        int count = 0 , max = 0;
        for(int i = 0 , nextMax = 0; i <= max && i < nums.length - 1 ; i++){
            nextMax = Math.max(nextMax , i + nums[i]);
            if(i == max){
                max = nextMax;
                count++;
            }
        }
        return max >= nums.length - 1? count : -1;
    }
}
