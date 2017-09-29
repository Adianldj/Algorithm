package IXL;

import java.util.*;

/**
 * Created by renee on 8/13/17.
 */
public class AnagramDiff {
    public int getDiff(String w1, String w2) {
        int[] mark = new int[26];
        for (int i = 0; i < w1.length(); i++) {
            mark[w1.charAt(i) - 'a']++;
            mark[w2.charAt(i) - 'a']--;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            if (mark[i] > 0) {
                result += mark[i];
            }
        }
        return result;
    }
    public int[] getMindiff(String[] l1, String[] l2) {
        int[] result = new int[l1.length];
        for (int i = 0; i < l1.length; i++) {
            if (l1[i].length() != l2[i].length()) {
                result[i] = -1;
            } else {
                result[i] = getDiff(l1[i], l2[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        AnagramDiff sol = new AnagramDiff();
        System.out.println(sol.getDiff("eeeee", "world"));
    }
}
