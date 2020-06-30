package sort;

import java.util.Arrays;

public class HeapSort {
	// 对排序 最佳最差时间复杂度都为nlog2(n),空间复杂度1 不稳定
	static int len;

	public int[] sort(int[] nums) {
		len = nums.length;
		if (len < 1)
			return nums;
		// 构建一个最大堆
		buildMaxHeap(nums);
		// 循环将堆首位（最大值）与末尾交换，然后重新调整最大堆
		while (len > 0) {
			swap(nums, 0, len - 1);
			len--;
			adjustHeap(nums,0);
		}
		return nums;

	}

	private void buildMaxHeap(int[] nums) {
		//从最后一个非叶子节点开始向上构造最大堆  有可能是第一个叶子点 与最后一个子节点交换无影响
		for (int i = (len - 1)/2; i >= 0; i--) {
			adjustHeap(nums,i);
		}

	}

	private void adjustHeap(int[] nums,int i) {
        int maxIndex = i;
        //如果有左子树，且左子树大于父节点，则将最大指针指向左子树
		int leftChild = i * 2 + 1;
		if (leftChild < len && nums[leftChild] > nums[maxIndex]) {
			maxIndex =leftChild;
		}
        //如果有右子树，且右子树大于父节点，则将最大指针指向右子树
		int rightChild = i * 2 + 2;
		if (rightChild <len && nums[rightChild] > nums[maxIndex]) {
			maxIndex = rightChild;
		}
        // 如果父节点不是最大值，则将父节点与最大值交换，并且递归调制与父节点交换的位置
        if (maxIndex != i) {
			swap(nums, maxIndex, i);
			adjustHeap(nums, maxIndex);
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}
	public static void main(String[] args) {
		HeapSort t = new HeapSort();
		int[] nums = {4, 1, 3, 2,55,23,14,8,7,3,5,25};
		System.out.println(Arrays.toString(t.sort(nums)));
	}
}
