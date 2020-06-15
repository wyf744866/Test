package testforday2;

import java.util.Arrays;

/**
 * @author wyf
 * @create 2020/6/14
 */
public class Test1300_2 {
    //枚举加二分查找
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }
        int r = arr[n - 1];
        int ans = 0, diff = target;
        for (int i = 1; i <= r; ++i) {
/*            如果找到关键字，则返回值为关键字在数组中的位置索引，
             且索引从0开始如果没有找到关键字，返回值为负的插入点值*/
            int index = Arrays.binarySearch(arr, i);
            if (index < 0) {
                index = -index - 1;
            }
            int cur = prefix[index] + (n - index) * i;
            if (Math.abs(cur - target) < diff) {
                ans = i;
                diff = Math.abs(cur - target);
            }
        }
        return ans;
    }

}
