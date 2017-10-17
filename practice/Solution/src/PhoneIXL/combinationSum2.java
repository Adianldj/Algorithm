package PhoneIXL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
      if (candidates == null || candidates.length == 0){
          return res;
      }
      
      Arrays.sort(candidates);
      helper (res, new ArrayList<Integer>(), candidates, target,0,0);
      return res;
  }
  
  public void helper (List<List<Integer>> res, List<Integer> ls, int[] candidates, int target, int sum, int pos){
      if (sum == target){
          res.add(new ArrayList<Integer>(ls));
          return;
      }
      
      for (int i = pos; i < candidates.length; i++){
          if (sum + candidates[i] > target){
              break;
          }
          if (i != pos && candidates[i] == candidates[i-1]){
              continue;
          }
          ls.add(candidates[i]);
          helper(res, ls, candidates, target, sum+candidates[i], i+1);
          ls.remove(ls.size() - 1);
      }
  }
}
//Time:O(2^n) Space:O(n)
