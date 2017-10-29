package Microsoft;

public class ImplementQueue<Integer> {
	int[] array;
	int head = -1;
	int tail = -1;
	int size;
	public ImplementQueue(int size){
		this.size = size;
		int[] newarray = new int[size];
		this.array = newarray;
	}
	
	public void enQueue(int value){
		if (size == array.length){
			return;
		}
		head = (head + 1) % array.length;
		array[head] = value;
		size++;
 
		if(tail == -1){
			tail = head;
		}
		return;
	}
	public int pop(){
		if(size == 0){
			return -1;
		}
		int result = array[tail];
		size--;
		tail = (tail + 1) % array.length;
		if(size == 0){
			head = -1;
			tail = -1;
		}
		return result;
	}
}
