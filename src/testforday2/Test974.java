package testforday2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wyf
 * @create 2020/5/27
 */
public class Test974 {
    public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> record = new HashMap<>();
        record.put(0, 1);
        int sum = 0, ans = 0;
        for (int elem: A) {
            sum += elem;
            // 注意 Java 取模的特殊性，当被除数为负数时取模结果为负数，需要纠正
            int modulus = (sum % K + K) % K;
            int same = record.getOrDefault(modulus, 0);
            //  (P[j]−P[i−1])%k==0，根据 同余定理，只要 P[j]%K == P[i-1]%K
            ans +=same;
            record.put(modulus, same + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        Test974 t = new Test974();
        System.out.println(t.subarraysDivByK(nums, 5));
    }
}
