package sort;

import java.util.Arrays;

public class CountingSort {
	// �������� ������ʱ�临�Ӷȶ�Ϊn+k,�ռ临�Ӷ� k �ȶ�
      public int[] sort(int[] nums) {
		if (nums.length == 0) return nums;
		int bias,min = nums[0], max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) max = nums[i];
			if (nums[i] < min) min = nums[i]; 
		}
		bias = 0 - min;
		int[] bucket = new int[max- min +1];
		for (int i = 0; i < nums.length; i++) {
			bucket[nums[i]+bias]++;
		}
		int index = 0,i = 0;
		while (index < nums.length) {
			if (bucket[i] != 0) {
				nums[index] = i -bias;
				bucket[i]--;
				index++;
			}else {
				i++;
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 2, 4, 5, 3,6,22,13,44,2,13,7,10};
		CountingSort t = new CountingSort();
		System.out.println(Arrays.toString(t.sort(nums)));
	}
}
