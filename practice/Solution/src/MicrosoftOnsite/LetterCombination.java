package MicrosoftOnsite;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
	 public List<String> letterCombinations(String digits) {
         String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<String>();
        if(digits == null || digits.length() == 0){
            return result;
        }
      result.add("");
      for(int i = 0 ; i < digits.length() ; i++){
          result = helper(result , digitletter[digits.charAt(i) - '0']);
      }
      return result;
  }
  private List<String> helper(List<String> pre , String s){
      List<String> newResult = new ArrayList<String>();
     for(int i = 0 ; i < s.length() ; i++)
     {
         for(String word : pre) {
             newResult.add(new String(word + s.charAt(i)));
         }
     }    
      return newResult;
  }
}

