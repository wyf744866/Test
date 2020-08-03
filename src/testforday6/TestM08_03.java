package testforday6;

/**
 * @author wyf
 * @create 2020/7/31
 */
public class TestM08_03 {

    public int findMagicIndex(int[] nums) {
        return getAnswer(nums, 0, nums.length - 1);
    }

    public int getAnswer(int[] nums, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (right - left) / 2 + left;
        int leftAnswer = getAnswer(nums, left, mid - 1);
        if (leftAnswer != -1) {
            return leftAnswer;
        } else if (nums[mid] == mid) {
            return mid;
        }
        return getAnswer(nums, mid + 1, right);
    }

    public static void main(String[] args) {
        TestM08_03 t = new TestM08_03();
        int[] nums = {1,1, 2, 3, 4, 5};
        System.out.println(t.findMagicIndex(nums));
    }

   /* public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i]) return i;
        }
        return -1;
    }*/
}
