package sort;

import java.util.Arrays;

public class SelectSort {
	//简单选择排序 时间复杂度都为n^2,空间复杂度1  不 稳定
    public int[] select(int[] nums) {
		int len = nums.length;

		for (int i = 0; i < len; i++) {
			int minIndex = i;
			for (int j = i+1; j < len; j++) {
				if (nums[j] < nums[minIndex]) {					
					minIndex = j;
				}
			}
			int num = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = num;  //由于把前面的数据交换到后面了所以不稳定
		}
		return nums;
	}
    public static void main(String[] args) {
    	SelectSort t = new SelectSort();
		int[] nums = {1,2,4,2,4,5,3,15,102};
		System.out.println(Arrays.toString(t.select(nums)));
	}
}
