package testforday3;

/**
 * @author wyf
 * @create 2020/6/17
 */
public class Test1014 {
    public int maxScoreSightseeingPair(int[] A) {
        int ans = 0, mx = A[0] + 0;
        for (int j = 1; j < A.length; ++j) {
            ans = Math.max(ans, mx + A[j] - j);
            // 边遍历边维护
            mx = Math.max(mx, A[j] + j);
        }
        return ans;
    }

    public static void main(String[] args) {
        Test1014 t = new Test1014();
        int[] nums = {8,1,5,2,6};
        System.out.println(t.maxScoreSightseeingPair(nums));
    }
}
