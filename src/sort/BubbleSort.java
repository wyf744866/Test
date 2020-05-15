package sort;

import java.util.Arrays;

public class BubbleSort {
	//冒泡排序  平均 时间 复杂度O（n^2）最佳情况 O（n）最差O（n^2） 空间复杂度 1 稳定；
	public int[] bubble(int[] nums) {
		int len = nums.length;
        for (int i = len -1; i >= 0 ; i--) {
			for (int j = 0; j < i; j++) {
				if (nums[j]> nums[j+1]) {
					int num = nums[j];
					nums[j] = nums[j+1];
					nums[j+1]=num;
				}
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		BubbleSort t = new BubbleSort();
		int[] nums = {1,2,4,2,4,5,3};
		System.out.println(Arrays.toString(t.bubble(nums)));
	}
}
