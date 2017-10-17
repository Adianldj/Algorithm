package PhoneIXL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dearrangement {
	public List<char[]> getDerragement(char[] chars){
        List<char[]> result = new ArrayList<char[]>();
        if(chars == null || chars.length == 0){
            return result;
        }
        Map<Integer,Character> indexCharacterMap = new HashMap<Integer,Character>();
        int i = 0;
        for(char c:chars){
            indexCharacterMap.put(i,c);
            i++;
        }
        permute(chars,indexCharacterMap,0,result);
        return result;
    }

    private void permute(char[] chars,Map<Integer,Character> indexCharacterMap,int start,List<char[]> result){
        if(start>=chars.length){
            result.add(Arrays.copyOf(chars,chars.length));
            return;
        }

        for(int i = start;i<chars.length;i++){
            if(indexCharacterMap.get(i)!=chars[start]){
                swap(chars,i,start);
                permute(chars,indexCharacterMap,start+1,result);
                swap(chars,i,start);
            }
        }
    }

    private void swap(char[] chars,int i,int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    public static void main(String argsp[]){
    	dearrangement dearrangements = new dearrangement();
        char[] chars = {'A','B','C','D','E'};
        List<char[]> result = dearrangements.getDerragement(chars);
        for(char[] items : result){
            for(char item:items){
                System.out.print(" "+item);
            }
            System.out.println();
        }
    }
}
//Time:O(n * n!) since there are n! permutations
//Space: o(n)
