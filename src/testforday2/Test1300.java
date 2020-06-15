package testforday2;

import java.util.Arrays;

/**
 * @author wyf
 * @create 2020/6/14
 */
public class Test1300 {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        return subFind(arr, 0, target);
    }

    private int subFind(int[] arr, int a, int target) {
        int len = arr.length;
        int max = arr[len - 1], min = arr[a];
        int average = target / (arr.length - a);
        if (max <= average) return max;
        if (min >= average) {
            int b = Math.abs(average * (len - a) - target);
            int c = Math.abs((average + 1) * (len - a) - target);
            if (b <= c) return average;
            return average + 1;
        }
        int sum = 0;
        for (int i = a; i < arr.length; i++) {
            if (arr[i] > average) {
                return subFind(arr, i, target - sum);
            }
            sum += arr[i];

        }
        return average;
    }

    public static void main(String[] args) {
        Test1300 t = new Test1300();
        int[] arr = {1547,83230,57084,93444,70879};
        System.out.println(t.findBestValue(arr, 71237));
    }
}
