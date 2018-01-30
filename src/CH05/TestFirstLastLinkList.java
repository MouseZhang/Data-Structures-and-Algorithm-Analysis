package CH05;

public class TestFirstLastLinkList {
	public static void main(String[] args) {
		FirstLastLinkList fl1 = new FirstLastLinkList();
		fl1.insertFirst(34);
		fl1.insertFirst(56);
		fl1.insertFirst(67);
		fl1.display();
		
		fl1.deleteFirst();
		fl1.deleteFirst();
		fl1.display();
		
		FirstLastLinkList fl2 = new FirstLastLinkList();
		fl2.insertLast(56);
		fl2.insertLast(90);
		fl2.insertLast(12);
		fl2.display();
		
		fl2.deleteFirst();
		fl2.display();
	}

}
