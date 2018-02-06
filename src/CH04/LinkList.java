package CH04;
/**
 * 链表
 * @author MouseZhang
 *
 */
public class LinkList {
	//头结点
	private Node first;
	
	public LinkList() {
		first = null;
	}
	
	/**
	 * 插入一个结点，在头结点后进行插入
	 * @param value
	 */
	public void insertFirst(long value) {
		Node node = new Node(value);
		node.next = first;						//最后插入的放在链表的头部
		first = node;							//新插入的结点设为头结点
	}
	
	/**
	 * 删除一个结点，在头结点后进行删除
	 * @return
	 */
	public Node deleteFirst() {
		Node temp = first;
		first = temp.next;
		return temp;
	}
	
	/**
	 * 显示方法
	 */
	public void display() {
		Node current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}
	
	/**
	 * 查找方法
	 * @param value
	 * @return
	 */
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

	/**
	 * 删除方法，根据数据域来进行删除
	 * @param value
	 * @return
	 */
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
