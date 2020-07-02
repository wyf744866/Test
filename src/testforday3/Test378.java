package testforday3;

/**
 * @author wyf
 * @create 2020/7/2
 */
public class Test378 {
    public int kthSmallest(int[][] matrix, int k) {
        //超时
        int len = matrix.length;
        int k1 = 0,min = Integer.MAX_VALUE;
        int temp = 0;
        int[] index = new int[len];
        while (k1 < k) {
            for (int i = 0; i < len; i++) {
                if (index[i] < len && matrix[i][index[i]] <= min){
                    min = matrix[i][index[i]];
                     temp = i;
                }
            }
            index[temp]++;
        }
        return min;
    }
}
