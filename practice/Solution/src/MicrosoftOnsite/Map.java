package MicrosoftOnsite;

public class Map {
	private int ArraySize = 256;
	private Node[] bucketArray = new Node[ArraySize];
	
	public Map(){}
	public Map(int initialsize){
		this.ArraySize = initialsize;
	}
	public void put(String key , String value){
		int hash = Math.abs(key.hashCode() % ArraySize);
		Node entry = new Node(key , value);
		if(bucketArray[hash] == null){
			bucketArray[hash] = entry;
		} else {
			Node current = bucketArray[hash];
			while(current.next != null){
				if(current.getKey().equals(entry.getKey())){
					current.setValue(entry.getValue());
					return;
				}
				current = current.next;
			}
			current.next = entry;
		}
	}
	public String get(String key){
		int hash = Math.abs(key.hashCode() % ArraySize);
		Node n = bucketArray[hash];
		while(n != null){
			if(n.getKey().equals(key)){
				return n.getValue();
			}
			n = n.getNext();
		}
		return null;
		
	}
	class Node{
		private String key;
		private String value;
		private Node next;
		public Node(){}
		public Node(String key , String value){
			this.key = key;
			this.value = value;
		}
		public String getKey(){
			return key;
		}
		public void setKey(String key){
			this.key = key;
		}
		public String getValue(){
			return value;
		}
		public void setValue(String value){
			this.value = value;
		}
		public Node getNext(){
			return next;
		}
		public void setNext(Node next){
			this.next = next;
		}
	}
	
}
