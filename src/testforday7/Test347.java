package testforday7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author wyf
 * @create 2020/9/7
 */
public class Test347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> kNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (kNums.get(nums[i]) != null) {
                kNums.put(nums[i], kNums.get(nums[i]) + 1);
            } else {
                kNums.put(nums[i], 1);
            }
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return kNums.get(o1).compareTo(kNums.get(o2));
            }
        });
        for (Integer key : kNums.keySet()) {
            if (priorityQueue.size() != k) {
                priorityQueue.add(key);
            }else {
                if (kNums.get(key) > kNums.get(priorityQueue.peek())){
                    priorityQueue.poll();
                    priorityQueue.add(key);
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        Test347 test347 = new Test347();
        int[] nums = {4,1,-1,2,-1,2,3};
        System.out.println(test347.topKFrequent(nums, 2));
    }
}
