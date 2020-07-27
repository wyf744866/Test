package testforday5;

/**
 * @author wyf
 * @create 2020/7/25
 */
public class Test410_3 {
/*    首先分析题意，可以得出结论，结果必定落在【max（nums）， sum（nums）】这个区间内，
    因为左端点对应每个单独的元素构成一个子数组，右端点对应所有元素构成一个子数组。
    然后可以利用二分查找法逐步缩小区间范围，当区间长度为1时，即找到了最终答案。
    每次二分查找就是先算一个mid值，这个mid就是代表当前猜测的答案，然后模拟一下划分子数组的过程，
    可以得到用这个mid值会一共得到的子区间数cnt，然后比较cnt和m的关系，来更新区间范围。*/
    public int splitArray(int[] nums, int m) {
        int left = 0, right = 0;
        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
            if (left < nums[i]) {
                left = nums[i];
            }
        }
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (check(nums, mid, m)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean check(int[] nums, int x, int m) {
        int sum = 0;
        int cnt = 1;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > x) {
                cnt++;
                sum = nums[i];
            } else {
                sum += nums[i];
            }
        }
        return cnt <= m;
    }

}
