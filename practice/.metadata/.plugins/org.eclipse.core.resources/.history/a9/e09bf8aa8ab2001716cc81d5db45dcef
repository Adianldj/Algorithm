package PhoneIXL;

import java.util.HashMap;
import java.util.Map;

public class stickerstoSpell {
	public int minStickers(String[] stickers , String target){
		int m = stickers.length;
        int[][] stickermap = new int[m][26];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) 
            for (char c:stickers[i].toCharArray()) stickermap[i][c-'a']++;
        map.put("", 0);
        return helper(map, stickermap, target);
    }
    private int helper(Map<String, Integer> map, int[][] stickermap, String target) {
        if (map.containsKey(target)) return map.get(target);
        int ans = Integer.MAX_VALUE, n = stickermap.length;
        int[] tar = new int[26];
        for (char c:target.toCharArray()) tar[c-'a']++;
        // try every sticker
        for (int i = 0; i < n; i++) {
            // optimization
            if (stickermap[i][target.charAt(0)-'a'] == 0) continue;
            StringBuilder sb = new StringBuilder();
            // apply a sticker on every character a-z
            for (int j = 0; j < 26; j++) {
                if (tar[j] > 0 ) 
                    for (int k = 0; k < Math.max(0, tar[j]-stickermap[i][j]); k++)
                        sb.append((char)('a'+j));
            }
            String s = sb.toString();
            int tmp = helper(map, stickermap, s);
            if (tmp != -1) ans = Math.min(ans, 1+tmp);
        }
        map.put(target, ans == Integer.MAX_VALUE? -1:ans);
        return map.get(target);
		
	}
}
