package sort;

import java.util.Arrays;

public class QuickSort2 {
	//�������� ƽ��ʱ�临�Ӷ�nlog2(n),���nlog2(n)�����n^2,�ռ临�Ӷ�n��log2(n) ���ȶ�
  public int[] sort(int[] nums ,int start,int end) {
	if (nums.length < 1 || start < 0 || end > nums.length ||end < start) return null;
	int smallIndex = partition(nums,start,end);
	if (smallIndex > start)
		sort(nums, start, smallIndex - 1);   //smallIndexλ���Ѿ��̶�
    if (smallIndex < end)
    	sort(nums, smallIndex + 1, end);
    return nums;

}

  public static int partition(int[] array, int start, int end) {
      int pivot = (int) (start + Math.random() * (end - start + 1));//��׼ȡ�м��� Ҳ��ȡ��һλ��
      int smallIndex = start - 1;
      swap(array, pivot, end);
      for (int i = start; i <= end; i++)
          if (array[i] <= array[end]) {
              smallIndex++;
              if (i > smallIndex) //��С�ڻ�׼��ֵǰ������׼�����м�λ��
                  swap(array, i, smallIndex);
          }
      return smallIndex;
  }

  public static void swap(int[] array, int i, int j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
  }
  
  public static void main(String[] args) {
		QuickSort2 t = new QuickSort2();
		int[] nums = { 1, 2, 4, 2, 4, 5, 3,8,12,4,1,5,10,3,55,3 };
		System.out.println(Arrays.toString(t.sort(nums, 0, nums.length - 1)));
	}

}
