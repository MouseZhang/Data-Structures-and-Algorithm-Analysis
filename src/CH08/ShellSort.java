package CH08;
/**
 * 希尔排序
 * @author MouseZhang
 *
 */
public class ShellSort {
	public static void sort(long[] arr) {
		//初始化一个间隔
		int h = 1;
		//计算最大间隔
		while (h < arr.length / 3)
			h = h * 3 + 1;
		while (h > 0) {
			//进行插入排序
			long temp = 0;
			for (int i = h; i < arr.length; i++) {
				temp = arr[i];
				int j = i;
				while (j > h - 1 && arr[j - h] >= temp) {
					arr[j] = arr[j - h];
					j -= h;
				}
				arr[j] = temp;
			}
			//减小间隔，h = 1时就是插入排序
			h = (h - 1) / 3;
		}
	}
}
