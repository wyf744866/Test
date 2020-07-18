package testforday4;

/**
 * @author wyf
 * @create 2020/7/17
 */
public class Test35 {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length <=0) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target){
                return i;
            }
        }

        return nums.length;
    }
}
