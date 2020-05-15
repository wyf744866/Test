package sort;

import java.util.Arrays;

public class Exercise {
	public int[] quickSort(int[] nums ,int start,int end) {
		if (nums.length < 1 || start < 0 ||end > nums.length-1 ||start > end) {
			return null;
		}
		int midIndex = subSort(nums ,start,end);
		if (midIndex > start) {
			quickSort(nums, start, midIndex-1);
		}
		if (midIndex < end) {
			quickSort(nums, midIndex + 1, end);
		}
		return nums;
	}

	private int subSort(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		int center = start;
		int midIndex = start -1 ;
		swops(nums,center,end);
		for (int i = start; i <= end; i++) {
			if (nums[i] <= nums[end]) {
				midIndex++;
				if (i > midIndex) {
					swops(nums, i, midIndex);
				}
			}
		}
		
		return midIndex;
	}

	private void swops(int[] nums, int a, int b) {
		// TODO Auto-generated method stub
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	public static void main(String[] args) {
		Exercise t = new Exercise();
		int[] nums = { 1, 2, 4, 2, 4, 5, 3,6,22,13,44,2,13,7,4};
		System.out.println(Arrays.toString(t.quickSort(nums, 0, nums.length - 1)));
	}

}
