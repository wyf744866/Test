package testforday;

/**
 * @author wyf
 * @create 2020/5/24
 */
public class Test4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        int[] nums = new int[len];
        int i = 0,j = 0,index = 0;
        while (index < len){
            if (i >= len1){
                nums[index] = nums2[j++];
            }else if (j >=len2){
                nums[index] = nums1[i++];
            }else if (nums1[i] < nums2[j]){
                nums[index] = nums1[i++];
            }else {
                nums[index] = nums2[j++];
            }
            index++;
        }
        if ((len) %2 == 0){
            return  (nums[len/2-1] + nums[len/2])/2.0;
        }else {
            return  nums[len/2];
        }

    }
}
