package CH03;

public class TestMyStack {
	public static void main(String[] args) {
		MyStack myStack = new MyStack(4);
		myStack.push(23);
		myStack.push(12);
		myStack.push(1);
		myStack.push(90);
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.isFull());
		
		System.out.println(myStack.peek());
		System.out.println(myStack.peek());
		
		while (!myStack.isEmpty()) {
			System.out.print(myStack.pop() + ", ");	
		}
		
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.isFull());
	}

}
