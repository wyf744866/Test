package sort;

import java.util.Arrays;

public class MergeSort {
	//归并排序 时间复杂度最差nlog2(n)最佳nlog2(n)  平均 nlog2(n)  空间复杂度n 稳定
	public int[] mergeSort(int[] nums) {
		if (nums.length < 2) {
			return nums;
		}
		int mid = nums.length / 2;
		int[] left = Arrays.copyOfRange(nums, 0, mid);
		int[] right = Arrays.copyOfRange(nums, mid, nums.length);
		return merge(mergeSort(left), mergeSort(right));
	}

	private int[] merge(int[] left, int[] right) {
		// TODO Auto-generated method stub
		int[] result = new int[left.length + right.length];
		for (int index = 0, i = 0, j = 0; index < result.length; index++) {
			if (i >= left.length) {
				result[index] = right[j++];
			} else if (j >= right.length) {
				result[index] = left[i++];
			} else if (left[i] > right[j]) {
				result[index] = right[j++];
			} else {
				result[index] = left[i++];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		MergeSort t = new MergeSort();
		int[] nums = { 1, 2, 4, 2, 4, 5, 3 };
		System.out.println(Arrays.toString(t.mergeSort(nums)));
	}
}
