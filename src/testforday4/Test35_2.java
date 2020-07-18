package testforday4;

/**
 * @author wyf
 * @create 2020/7/17
 */
public class Test35_2 {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length <= 0) return 0;
        int length = nums.length;
        int left = 0, right = length - 1,ans = length;
        while (left <= right) {
            int temp = left + (right - left) / 2;
            if (nums[temp] >= target) {
                ans = temp;
                right = temp - 1;
            } else {
                left = temp + 1;
            }
        }

        return ans;
    }
}
