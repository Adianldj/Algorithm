package BloombergOnsite;

import java.util.ArrayList;
import java.util.List;

public class encodedecodeString {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append('/').append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<String>();
        int i = 0;
        while(i < s.length()){
            int slash = s.indexOf('/' , i);
            int size = Integer.valueOf(s.substring(i , slash));
            result.add(s.substring(slash + 1 , slash + size + 1));
            i = slash + size + 1;
        }
        return result;
    }
}
