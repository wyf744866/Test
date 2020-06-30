package testforday3;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author wyf
 * @create 2020/6/29
 */
public class Test215 {
/*    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        PriorityQueue<Integer> maxS = new PriorityQueue<>(len - k+1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int num : nums) {
            if (maxS.size() != len - k+1) {
                maxS.offer(num);
            }else if (maxS.peek() > num){
                Integer temp = maxS.poll();
                temp = null;
                maxS.offer(num);
            }

        }
        return maxS.peek();
    }*/
        public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxS = new PriorityQueue<>(k);
        for (int num : nums) {
            if (maxS.size() != k) {
                maxS.offer(num);
            }else if (maxS.peek() < num){
                Integer temp = maxS.poll();
                temp = null;
                maxS.offer(num);
            }

        }
        return maxS.peek();
    }

    public static void main(String[] args) {
        Test215 t = new Test215();
        int[] nums ={3,2,1,5,6,4};
        System.out.println(t.findKthLargest(nums, 2));
    }
}
