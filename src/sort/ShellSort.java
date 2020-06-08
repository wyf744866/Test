package sort;

import java.util.Arrays;

public class ShellSort {
	//ϣ������ ʱ�临�Ӷ�Ϊnlog(С2 n),���n^2 ���n���ռ临�Ӷ�1 ���ȶ�
	public int[] shell(int[] nums) {
		int temp, gap = nums.length / 2;
		while (gap > 0) {
			for (int i = gap; i < nums.length; i++) {
				temp = nums[i];
				int preIndex = i - gap;
				while (preIndex >= 0 && nums[preIndex] > temp) {
					nums[preIndex + gap] = nums[preIndex];
					preIndex -= gap;
				}
				nums[preIndex + gap] = temp;
			}
			gap = gap / 2;
		}
		return nums;
	}

	public static void main(String[] args) {
		ShellSort t = new ShellSort();
		int[] nums = { 1, 2, 4, 2, 4, 5, 3 ,7};
		System.out.println(Arrays.toString(t.shell(nums)));
	}
}
