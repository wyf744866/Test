package testforday4;

import java.util.*;

/**
 * @author wyf
 * @create 2020/7/13
 */
public class Test350 {
/*    如果给定的数组已经排好序呢？你将如何优化你的算法？
      二路归并法
    如果 nums1 的大小比 nums2 小很多，哪种方法更优？
    二分查找法
    */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nums = new HashMap<>();
        List<Integer> result= new ArrayList<>();
        Set<Integer> unite = new HashSet<>();
        for (int num : nums1) {
            if (nums.containsKey(num)){
                nums.put(num,nums.get(num)+1);
            }else {
                nums.put(num,1);
            }
        }
        for (int num : nums2) {
            if (nums.containsKey(num)){
                unite.add(num);
                nums.put(num,nums.get(num)+1);
            }
        }

        for (Map.Entry<Integer, Integer> numEntry : nums.entrySet()) {
            if (numEntry.getValue() >=2 && unite.contains(numEntry.getKey())){ //判断还会出错  见2的逻辑
                for (int i = 0; i < numEntry.getValue()/2; i++) {
                    result.add(numEntry.getKey());
                }
            }
        }
        int[] a = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            a[i] = result.get(i);
        }

        return a;
    }
}
