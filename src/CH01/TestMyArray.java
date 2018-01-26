package CH01;

public class TestMyArray {
	public static void main(String[] args) {
		MyArray arr = new MyArray();
		arr.insert(13);
		arr.insert(34);
		arr.insert(90);
		
		arr.display();
		System.out.println(arr.search(190));
		System.out.println(arr.get(1));
		
		arr.change(0, 12);
		arr.display();
		
		MyOrderArray orderArr = new MyOrderArray();
		orderArr.insert(90);
		orderArr.insert(30);
		orderArr.insert(80);
		orderArr.insert(10);
		orderArr.display();
		
		System.out.println(orderArr.binarySearch(30));
		
	}

}
