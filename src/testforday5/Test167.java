package testforday5;

/**
 * @author wyf
 * @create 2020/7/20
 */
public class Test167 {
    public int[] twoSum(int[] numbers, int target) {
        int begin = 0, end = numbers.length - 1;
        while (begin < end) {
            if (numbers[begin] + numbers[end] < target) {
                begin++;
            } else if (numbers[begin] + numbers[end] > target) {
                end--;
            } else {
                return new int[]{begin + 1, end + 1};
            }
        }

        return new int[]{-1 ,-1};
    }
}
