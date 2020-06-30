package testforday3;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wyf
 * @create 2020/6/28
 */
public class Test209 {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        Queue<Integer> subNum = new LinkedList<>();
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            subNum.add(nums[i]);
            sum += nums[i];
            while (sum >= s){
                int size = subNum.size();
                minLen = Math.min(size,minLen);
                sum -= subNum.poll();
            }
        }
        return minLen== Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        Test209 t = new Test209();
        int[] nums = {2,3,1,2,4,3};
        System.out.println(t.minSubArrayLen(7, nums));
    }
}
