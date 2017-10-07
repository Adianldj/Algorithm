package PhoneIXL;

import java.util.Arrays;

public class longestCommonPrefix {
	public String longest(String[] strs){
		if(strs == null || strs.length == 0){
			return null;
		}
		String pre = strs[0];
		int i = 0;
		while(i < strs.length){
			while(strs[i].indexOf(pre) != 0){
				pre = pre.substring(0, pre.length() - 1);
			}
			i++;
		}
		return pre;
	}
}
