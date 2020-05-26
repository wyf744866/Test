package testforday;

/**
 * @author wyf
 * @create 2020/5/26
 */
public class Test287 {
    public int findDuplicate(int[] nums) {
        int x, y;
        x = y = 0;
        do {
            x = nums[x];
            y = nums[nums[y]];
        } while (x != y);

        x = 0;
        do {
            x = nums[x];
            y = nums[y];
        } while (x != y);
        return x;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        Test287 t = new Test287();
        System.out.println(t.findDuplicate(nums));
    }
}
