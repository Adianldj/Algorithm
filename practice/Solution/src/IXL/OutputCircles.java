package IXL;

import java.util.*;
/**
 * Created by renee on 8/13/17.
 */
public class OutputCircles {
    public List<Integer> countHoles(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] count = new int[] {1, 0, 0, 0, 1, 0, 1, 0, 2, 1};
        for (int i = 0; i < nums.length; i++) {
            int holes = 0;
            int num = nums[i];
            if (num == 0) {
                holes = 1;
            } else {
                while (num != 0) {
                    holes += count[num % 10];
                    num /= 10;
                }
            }
            result.add(holes);
        }
        return result;
    }
    public static void main(String[] args) {
        OutputCircles sol = new OutputCircles();
        System.out.println(sol.countHoles(new int[] {1234567890, 0}));
    }
}
