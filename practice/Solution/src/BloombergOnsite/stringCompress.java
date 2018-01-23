package BloombergOnsite;

public class stringCompress {
	public int compress(char[] chars) {
//      int start = 0;
//      for(int end = 0 , count = 0 ; end < chars.length ; end++){
//          count++;
//          if(end == chars.length - 1 || chars[end + 1] != chars[end]){
//              chars[start] = chars[end];
//              start++;
//              if(count != 1){
//                  char[] array = String.valueOf(count).toCharArray();
//                  for(int i = 0 ; i < array.length ; i++){
//                      chars[start++] = array[i];
//                  }
//              }
//              count = 0;
//          }
         
//      }
//      return start;
     int start = 0 ;
     for(int end = 0 , count = 0 ; end < chars.length ; end++){
         count++;
         if(end == chars.length - 1 || chars[end + 1] != chars[end]){
             chars[start] = chars[end];
             start++;
             if(count != 1){
                 char[] array = String.valueOf(count).toCharArray();
                 for(int i = 0 ; i < array.length ; i++){
                     chars[start++] = array[i];
                 }
             }
             count = 0;
         }
     }
     return start;
 }
}
