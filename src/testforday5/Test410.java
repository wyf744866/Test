package testforday5;

import java.util.Map;

/**
 * @author wyf
 * @create 2020/7/25
 */
public class Test410 {
    //超时
    public int splitArray(int[] nums, int m) {
        return subSplit(nums,0,nums.length-1,m);
    }

    private int subSplit(int[] nums, int start, int end, int m) {
        int sum = 0;
        if (m == 1) {
            for (int i = start; i <= end; i++) {
                sum+=nums[i];
            }
            return sum;
        }
        int minSum = Integer.MAX_VALUE;
        for (int i = start; i <= end-m+1; i++) {
            sum += nums[i];
            int maxSum=Math.max(sum,subSplit(nums,i+1,end,m-1));
            minSum = Math.min(minSum,maxSum);
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        Test410 t = new Test410();
        System.out.println(t.splitArray(nums, 2));
    }
}
