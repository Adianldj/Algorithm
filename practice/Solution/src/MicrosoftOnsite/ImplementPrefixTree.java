package MicrosoftOnsite;
class Trieunit{
	public char val;
	public boolean isWord;
	public Trieunit[] children = new Trieunit[26];
	public Trieunit(){};
	Trieunit(char c){
		Trieunit node = new Trieunit();
		node.val = c;
	}
}
public class ImplementPrefixTree {
	private Trieunit root;
	public ImplementPrefixTree(){
		root = new Trieunit();
		root.val = ' ';
	}
	public void insert(String word){
		Trieunit ws = root;
		for(int i = 0 ; i < word.length() ; i++){
			char c = word.charAt(i);
			if(ws.children[c - 'a'] == null){
				ws.children[c - 'a'] = new Trieunit(c);
			}
			ws = ws.children[c - 'a'];
		}
		ws.isWord = true;
	}
	public boolean search(String word){
		Trieunit ws = root;
		for(int i = 0 ; i < word.length() ; i++){
			char c = word.charAt(i);
			if(ws.children[c - 'a'] == null){
				return false;
			}
			ws = ws.children[c - 'a'];
		}
		return ws.isWord;
	}
	public boolean startsWith(String word){
		Trieunit ws = root;
		for(int i = 0 ; i < word.length() ; i++){
			char c = word.charAt(i);
			if(ws.children[c - 'a'] == null){
				return false;
			}
			ws = ws.children[c - 'a'];
		}
		return true;
	}
	
	
	
}
