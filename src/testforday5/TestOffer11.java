package testforday5;

/**
 * @author wyf
 * @create 2020/7/22
 */
public class TestOffer11 {
    public int minArray(int[] numbers) {
        if (numbers.length <= 0 || numbers == null) return -1;
        int min = numbers[numbers.length - 1];
        for (int i = numbers.length - 2; i >= 0; i--) {
            if (min >= numbers[i]) {
                min = numbers[i];
            }else {
                return  min;
            }

        }

        return min;
    }
}
