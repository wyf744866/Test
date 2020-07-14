package testforday4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author wyf
 * @create 2020/7/8
 */
public class TestM16_11 {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) return null;
        Set<Integer> length = new TreeSet<>();
        for (int i = 0; i <= k / 2; i++) {
            int temp = shorter * i + longer * (k - i);
            length.add(temp);
            int temp2 = shorter * (k - i) + longer * i;
            length.add(temp2);
        }
        int[] result = new int[length.size()];
        int i = 0;
        for (Integer integer : length) {
            result[i++] = integer;
        }

        return result;
    }

    public static void main(String[] args) {
        TestM16_11 t = new TestM16_11();
        System.out.println(Arrays.toString(t.divingBoard(1, 2, 3)));
    }
}
