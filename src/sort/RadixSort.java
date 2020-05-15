package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {
	//基数排序 时间复杂度为n*k 空间复杂度为 n+k  稳定
	public int[] sort(int[] nums) {
		if (nums == null || nums.length < 2) {
			return nums;
		}
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		int maxDigit = 0;
		while (max != 0) {
			max = max / 10;
			maxDigit++;
		}
		int mod = 10, div = 1;
		ArrayList<ArrayList<Integer>> bucketList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 10; i++) {
			bucketList.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < maxDigit; i++, mod *= 10, div *= 10) {
			for (int j = 0; j < nums.length; j++) {
				int num = (nums[j] % mod)/div;
				bucketList.get(num).add(nums[j]);
			}
			int index = 0;
			for (int j = 0; j < bucketList.size(); j++) {
				for (int k = 0; k < bucketList.get(j).size(); k++) {
					nums[index++] = bucketList.get(j).get(k);
				}
				bucketList.get(j).clear();
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 2, 4, 5, 3, 8, 12, 4, 1, 5, 10, 3, 55, 3 };
		RadixSort t = new RadixSort();
		System.out.println(Arrays.toString(t.sort(nums)));
	}
}
