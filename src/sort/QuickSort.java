package sort;

import java.util.Arrays;

public class QuickSort {
	public int[] sort(int[] a, int low, int high) {
		int start = low;
		int end = high;
		int key = a[low];
		while (end > start) {
			// �Ӻ���ǰ�Ƚ�
			// ���û�бȹؼ�ֵС�ģ��Ƚ���һ����ֱ���бȹؼ�ֵС�Ľ���λ�ã�Ȼ���ִ�ǰ����Ƚ�
			while (end > start && a[end] >= key)
				end--;
			if (a[end] <= key) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			// ��ǰ����Ƚ�
			// ���û�бȹؼ�ֵ��ģ��Ƚ���һ����ֱ���бȹؼ�ֵ��Ľ���λ��
			while (end > start && a[start] <= key)
				start++;
			if (a[start] >= key) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			// ��ʱ��һ��ѭ���ȽϽ������ؼ�ֵ��λ���Ѿ�ȷ���ˡ���ߵ�ֵ���ȹؼ�ֵС���ұߵ�ֵ���ȹؼ�ֵ�󣬵������ߵ�˳���п����ǲ�һ���ģ���������ĵݹ����
		}
		// �ݹ�
		if (start > low)
			sort(a, low, start - 1);// ������С���һ������λ�õ��ؼ�ֵ����-1
		if (end < high)
			sort(a, end + 1, high);// �ұ����С��ӹؼ�ֵ����+1�����һ��
		return a;
	}

	public static void main(String[] args) {
		QuickSort t = new QuickSort();
		int[] nums = {  1, 2, 4, 2, 4, 5, 3,8,12,4,1,5,10,3,55,3 };
		System.out.println(Arrays.toString(t.sort(nums, 0, nums.length - 1)));
	}
}
