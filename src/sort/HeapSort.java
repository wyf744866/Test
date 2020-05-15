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

	private void adjustHeap(int[] nums,int i) {
        int maxIndex = i;
        //������������������������ڸ��ڵ㣬�����ָ��ָ��������
        if (i*2 < len && nums[2*i] > nums[maxIndex]) {
			maxIndex =2*i;
		}
        //������������������������ڸ��ڵ㣬�����ָ��ָ��������
        if (i*2+1 <len && nums[i*2 + 1] > nums[maxIndex]) {
			maxIndex = 2*i +1;
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

	private void buildMaxHeap(int[] nums) {
		//�����һ����Ҷ�ӽڵ㿪ʼ���Ϲ�������  �п����ǵ�һ��Ҷ�ӵ� �����һ���ӽڵ㽻����Ӱ��
		for (int i = (len - 1)/2; i >= 0; i--) {
			adjustHeap(nums,i);
		}

	}
	public static void main(String[] args) {
		HeapSort t = new HeapSort();
		int[] nums = { 1, 2, 4, 2, 4, 5, 3,6,22,13,44,2,13,7,10};
		System.out.println(Arrays.toString(t.sort(nums)));
	}
}
