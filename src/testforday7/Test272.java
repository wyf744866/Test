package testforday7;

/**
 * @author wyf
 * @create 2020/9/1
 */
public class Test272 {
    public boolean PredictTheWinner(int[] nums) {
        return total(nums, 0, nums.length - 1, 1) >= 0;
    }

    private int total(int[] nums, int start, int end, int turn) {
        if (start == end) {
            return nums[start] * turn;
        }
        int scoreStart = nums[start] * turn + total(nums, start + 1, end, -turn);
        int scoreEnd = nums[end] * turn + total(nums, start, end - 1, -turn);

        return Math.max(scoreStart * turn, scoreEnd * turn)*turn;
    }

    public static void main(String[] args) {
        Test272 t = new Test272();
        int[] nums = {1,5,2};
        t.PredictTheWinner(nums);
    }
}
