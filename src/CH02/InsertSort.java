package CH02;
/**
 * 插入排序
 * @author MouseZhang
 *
 */
public class InsertSort {
	public static void sort(long[] arr) {
		long temp = 0;
		
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] >= temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}

}
