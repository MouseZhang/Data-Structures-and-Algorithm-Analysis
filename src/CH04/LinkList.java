package CH04;

public class LinkList {
	private Node first;
	
	public LinkList() {
		first = null;
	}
	
	public void insertFirst(long value) {
		Node node = new Node(value);
		node.next = first;						//最后插入的放在链表的头部
		first = node;							//新插入的结点设为头结点
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = temp.next;
		return temp;
	}
	
	public void display() {
		Node current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}
	
	public Node find(long value) {
		Node current = first;
		while (current.data != value) {
			if (current.next == null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}

	public Node delete(long value) {
		Node current = first;
		Node previous = first;
		while (current.data != value) {
			if (current.next == null)
				return null;
			previous = current;
			current = current.next;
		}
		if (current == first)
			first = first.next;
		else
			previous.next = current.next;
		return current;
	}
}
