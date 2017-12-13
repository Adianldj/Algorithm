package MicrosoftOnsite;

public class shortenURL {
	public String idToShortURL(int n){
//		String map[] = new String[]{"abcdefghijklmnopqrstuvwxyzABCDEF"
//                "GHIJKLMNOPQRSTUVWXYZ0123456789"};
		char[] map = new char[]{'a' , 'b' ,'c'};
		StringBuilder shorturl = new StringBuilder();
		while(n > 0){
			shorturl.append(map[n % 62]);
			n = n / 62;
		}
		String url = shorturl.toString();
		reverse(url , 0 , url.length() - 1);
		return url;
	}
	private String reverse(String word , int i , int j){
		char[] array = word.toCharArray();
		while(i < j){
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return new String(array);
	}
	int shortURLtoID(String shortURL)
	{
	    int id = 0; // initialize result
	 
	    // A simple base conversion logic
	    for (int i=0; i < shortURL.length(); i++)
	    {
	        if ('a' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'z')
	          id = id*62 + shortURL.charAt(i) - 'a';
	        if ('A' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'Z')
	          id = id*62 + shortURL.charAt(i) - 'A' + 26;
	        if ('0' <= shortURL.charAt(i) && shortURL.charAt(i) <= '9')
	          id = id*62 +shortURL.charAt(i) - '0' + 52;
	    }
	    return id;
	}
}
