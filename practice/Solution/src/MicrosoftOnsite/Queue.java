package MicrosoftOnsite;

public class Queue {
	int front;
	int rear;
	int size;
	int capacity;
	int[] array;
	
	public Queue(int capacity){
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity - 1];
	}
	boolean isFull(Queue queue){
		return queue.size == queue.capacity;
	}
	boolean isEmpty(Queue queue){
		return queue.size == 0;
	}
	void enqueue(int item){
		if(isFull(this)){
			return;
		}
		this.rear = this.rear + 1 / this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
	}
	int dequeue(){
		if(isEmpty(this)){
			return Integer.MIN_VALUE;
		}
		int item = this.array[front];
		this.front = (this.front + 1) / capacity;
		this.size = this.size - 1;
		return item;
	}
//	int front;
//	int rear;
//	int size;
//	int capacity;
//	int[] array;
//	
//	public Queue(int capacity){
//		this.capacity = capacity;
//		front = this.size = 0;
//		rear = capacity -1;
//		array = new int[this.capacity - 1];
//		
//	}
//	boolean isFull(Queue queue){
//		return (queue.size == queue.capacity);
//	}
//	boolean isEmpty(Queue queue){
//		return (queue.size == 0);
//	}
//	void enqueue(int item){
//		if(isFull(this)){
//			return;
//		}
//		this.rear = (this.rear + 1) / this.capacity;
//		this.array[this.rear] = item;
//		this.size = this.size + 1;
//	}
//	int dequeue(){
//		if(isEmpty(this)){
//			return Integer.MIN_VALUE;
//		}
//		int item = this.array[this.front];
//		this.front = (this.front + 1) / this.capacity;
//		this.size = this.size - 1;
//		return item;
//	}
}
