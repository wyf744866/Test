package sort;

import java.util.Arrays;

public class InsertionSort {
	//ֱ�Ӳ������� ƽ��ʱ�临�Ӷ�n^2  ���n ���n^2 �ռ临�Ӷ� 1 �ȶ�
	public int[] insert(int[] nums) {
		int current;
		for (int i = 0; i < nums.length - 1; i++) {
			current = nums[i + 1];
			int preIndex = i;
			while (preIndex >= 0 && nums[preIndex] > current) {

				nums[preIndex + 1] = nums[preIndex];
				preIndex--;
			}
			nums[preIndex + 1] = current;
		}
		return nums;
	}
	 public static void main(String[] args) {
	    	InsertionSort t = new InsertionSort();
			int[] nums = {1,2,4,2,4,5,3};
			System.out.println(Arrays.toString(t.insert(nums)));
		}
}
