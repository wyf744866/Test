package testforday;

/**
 * @author wyf
 * @date 2020/5/18 - 13:15
 */
public class Test152 {
    public int maxProduct(int[] nums) {
        if (nums.length <= 0) return 0;
        long nMultimin = nums[0],nMultimax =nums[0];
        long maxNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            long mx = nMultimax, mn = nMultimin;
            nMultimax = Math.max(Math.max(nums[i], mn *nums[i]),mx*nums[i]);
            nMultimin = Math.min(Math.min(nums[i], mn *nums[i]),mx*nums[i]);
            maxNum = Math.max(nMultimax,maxNum);
        }
        return (int) maxNum;
    }
}
