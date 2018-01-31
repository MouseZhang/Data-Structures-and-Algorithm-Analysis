package CH09;
/**
 * 快速排序
 * @author MouseZhang
 *
 */
public class QuickSort {
	public static int partition(long arr[], int left, int right, long point) {
		int leftPtr = left - 1;
		int rightPtr = right;
		while (true) {
			// 循环，将比关键字小的留在左端
			while (leftPtr < rightPtr && arr[++leftPtr] < point);
			while (rightPtr > leftPtr && arr[--rightPtr] > point);
			if (leftPtr >= rightPtr)
				break;
			else {
				long temp = arr[leftPtr];
				arr[leftPtr] = arr[rightPtr];
				arr[rightPtr] = temp;
			}
		}
		// 将关键字与当前leftPtr所指的这一个进行交换
		long temp = arr[leftPtr];
		arr[leftPtr] = arr[right];
		arr[right] = temp;
		return leftPtr;
	}
	
	public static void displayArr(long[] arr) {
		System.out.print("[");
		for (long num: arr) {
			System.out.print(num + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void sort(long[] arr, int left, int right) {
		if (right - left <= 0)
			return;
		else {
			// 设置关键字
			long point = arr[right];
			// 获得切入点，同时对数组进行划分
			int partition = partition(arr, left, right, point);
			// 对左边的子数组进行快速排序
			sort(arr, left, partition - 1);
			// 对右边的子数组进行快速排序
			sort(arr, partition + 1, right);
		}
	}

}