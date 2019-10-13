

/**
 * @author Jayesh Gupta
 * @email guptajayesh3@gmail.com
 */

public class Queue {

	protected int[] data;
	protected int size;
	protected int front;

	public Queue(){
		this(5) ;
	}

	public Queue(int cap) {
		this.data = new int[cap];
		this.size = 0;
		this.front = 0;
	}

	public void enqueue(int item) throws Exception {

		if (this.size == this.data.length) {
			throw new Exception("Queue is Full.");
		}
		int tail = (this.front + this.size) % this.data.length;
		this.data[tail] = item;
		this.size++;

	}

	public int dequeue() throws Exception {

		if (this.size == 0) {
			throw new Exception("Queue is Empty.");
		}

		int rv = this.data[this.front];
		this.data[this.front] = 0;

		this.front = (this.front + 1) % this.data.length;
		this.size--;

		return rv;
	}

	public int front() throws Exception {

		if (this.size == 0) {
			throw new Exception("Queue is Empty.");
		}

		int rv = this.data[this.front];
		return rv;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void display() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i = 0; i < this.size; i++) {
			int idx = (this.front + i) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
		System.out.println(".");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
	}

}
