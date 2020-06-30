package sort;

import java.util.Arrays;

public class HeapSort {
	// ������ ������ʱ�临�Ӷȶ�Ϊnlog2(n),�ռ临�Ӷ�1 ���ȶ�
	static int len;

	public int[] sort(int[] nums) {
		len = nums.length;
		if (len < 1)
			return nums;
		// ����һ������
		buildMaxHeap(nums);
		// ѭ��������λ�����ֵ����ĩβ������Ȼ�����µ�������
		while (len > 0) {
			swap(nums, 0, len - 1);
			len--;
			adjustHeap(nums,0);
		}
		return nums;

	}

	private void buildMaxHeap(int[] nums) {
		//�����һ����Ҷ�ӽڵ㿪ʼ���Ϲ�������  �п����ǵ�һ��Ҷ�ӵ� �����һ���ӽڵ㽻����Ӱ��
		for (int i = (len - 1)/2; i >= 0; i--) {
			adjustHeap(nums,i);
		}

	}

	private void adjustHeap(int[] nums,int i) {
        int maxIndex = i;
        //������������������������ڸ��ڵ㣬�����ָ��ָ��������
		int leftChild = i * 2 + 1;
		if (leftChild < len && nums[leftChild] > nums[maxIndex]) {
			maxIndex =leftChild;
		}
        //������������������������ڸ��ڵ㣬�����ָ��ָ��������
		int rightChild = i * 2 + 2;
		if (rightChild <len && nums[rightChild] > nums[maxIndex]) {
			maxIndex = rightChild;
		}
        // ������ڵ㲻�����ֵ���򽫸��ڵ������ֵ���������ҵݹ�����븸�ڵ㽻����λ��
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
