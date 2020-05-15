package sort;

import java.util.Arrays;

public class BubbleSort {
	//ð������  ƽ�� ʱ�� ���Ӷ�O��n^2�������� O��n�����O��n^2�� �ռ临�Ӷ� 1 �ȶ���
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
