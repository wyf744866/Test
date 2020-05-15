package testforday;

/**
 * @author wyf
 * @date 2020/5/14 - 10:31
 */
public class  Test163 {
    public int singleNumber(int[] nums) {
         int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return  result;
    }

    public static void main(String[] args) {
        Test163 t = new Test163();
        int[] nums = {4,1,2,1,2};
        System.out.println(t.singleNumber(nums));
    }
}
