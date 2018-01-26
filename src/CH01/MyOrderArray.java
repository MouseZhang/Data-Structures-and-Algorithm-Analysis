package CH01;

public class MyOrderArray {
	private long[] arr;
	private int elements;
	
	public MyOrderArray() {
		arr = new long[50];
	}
	
	public MyOrderArray(int maxSize) {
		arr = new long[maxSize];
	}
	
	public void insert(long value) {
		int i;
		for (i = 0; i < elements; i++) {
			if (arr[i] > value) {				
				break;								//数组中有比value大的元素时，跳出循环
			}
		}
		
		for (int j = elements; j > i; j--) {	    //右移后面的元素
			arr[j] = arr[j - 1];
		}
		arr[i] = value;
		elements++;
	}
	
	public void display() {
		System.out.print("[");
		for (int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	public int search(long value) {
		int i;
		for (i = 0; i < elements; i++) {
			if (value == arr[i]) {
				break;
			}
		}
		
		if (i == elements) {
			return -1;
		}
		else {
			return i;
		}
	}

	public int binarySearch(long value) {
		int middle = 0;
		int low = 0;
		int high = elements;
		
		while (true) {
			middle = (low + high) / 2;
			if (arr[middle] == value) {
				return middle;
			}
			else if (low > high) {
				return -1;
			}
			else {
				if (arr[middle] > value) {
					high = middle - 1;
				}
				else {
					low = middle + 1;
				}
			}
		}
	}
	
	public void delete(int index) {
		if(index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for(int i = index; i < elements; i++) {
				arr[index] = arr[index + 1];
			}
			elements--;
		}
	}
	
	public void change(int index, int newValue) {
		if(index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			arr[index] = newValue;
		}
	}
	
}
