package testforday;

/**
 * @author wyf
 * @date 2020/5/15 - 12:51
 */
public class Test560 {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum += nums[j];
                if (sum == k){
                    result++;

                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Test560 t = new Test560();
        int[] nums = {1, 2,1,2, 1};
        System.out.println(t.subarraySum(nums, 3));
    }
}
