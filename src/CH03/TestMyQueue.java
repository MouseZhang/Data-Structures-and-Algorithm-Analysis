package CH03;

public class TestMyQueue {
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue(4);
		myQueue.insert(23);
		myQueue.insert(45);
		myQueue.insert(13);
		myQueue.insert(1);
		
		System.out.println(myQueue.isFull());
		System.out.println(myQueue.isEmpty());
		
		System.out.println(myQueue.peek());
		System.out.println(myQueue.peek());
		
		while (!myQueue.isEmpty()) {
			System.out.print(myQueue.remove() + " ");
		}
		System.out.println();
		
		MyCycleQueue myCycleQueue = new MyCycleQueue(4);
		myCycleQueue.insert(34);
		myCycleQueue.insert(3);
		myCycleQueue.insert(4);
		myCycleQueue.insert(14);
		
		System.out.println(myCycleQueue.isFull());
		System.out.println(myCycleQueue.isEmpty());
		
		System.out.println(myCycleQueue.peek());
		System.out.println(myCycleQueue.peek());
		
		while (!myCycleQueue.isEmpty()) {
			System.out.print(myCycleQueue.remove() + " ");
		}
		System.out.println();
		
		myCycleQueue.insert(34);
		myCycleQueue.insert(3);
		myCycleQueue.insert(4);
		myCycleQueue.insert(14);
		
		while (!myCycleQueue.isEmpty()) {
			System.out.print(myCycleQueue.remove() + " ");
		}
	}

}
