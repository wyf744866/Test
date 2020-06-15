package testforday2;

import java.util.*;

/**
 * @author wyf
 * @create 2020/6/12
 */
public class Test15 {
    public List<List<Integer>> threeSum(int[] nums) {
         //有重复数组
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> yz = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;  //避免重复的数组
            int temp = -nums[i];
            for (int j = i + 1; j < len; j++) {
                List<Integer> tempList = new ArrayList<>(3);
                int complement = temp - nums[j];
                if (yz.containsKey(complement) && yz.get(complement) != j) {
                    tempList.add(nums[i]);
                    tempList.add(nums[j]);
                    tempList.add(complement);
                    result.add(tempList);
                }
                yz.put(nums[j], j);
            }
            yz.clear();
        }
        return result;
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        int[] nums = {0, 0, 0, 0};
        System.out.println(t.threeSum(nums));
    }
}
