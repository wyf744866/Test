package sort;

import java.util.Arrays;

public class SelectSort {
	//��ѡ������ ʱ�临�Ӷȶ�Ϊn^2,�ռ临�Ӷ�1  �� �ȶ�
    public int[] select(int[] nums) {
		int len = nums.length;

		for (int i = 0; i < len; i++) {
			int minIndex = i;
			for (int j = i; j < len; j++) {
				if (nums[j] < nums[minIndex]) {					
					minIndex = j;
				}
			}
			int num = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = num;
		}
		return nums;
	}
    public static void main(String[] args) {
    	SelectSort t = new SelectSort();
		int[] nums = {1,2,4,2,4,5,3};
		System.out.println(Arrays.toString(t.select(nums)));
	}
}
