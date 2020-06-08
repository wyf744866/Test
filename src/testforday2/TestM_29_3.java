package testforday2;

import java.util.Arrays;

/**
 * @author wyf
 * @create 2020/6/5
 */
public class TestM_29_3 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return  new int[0];
        }
        int height = matrix.length;
        int depth = matrix[0].length;
        int index = 0;
        int[] result = new int[height*depth];
        int left = 0,right =depth-1,top = 0,bottom = height-1;
        while (left <= right && top <= bottom){
            for (int i = left; i <= right; i++){
                result[index++] = matrix[top][i];
            }
            for (int j = top + 1; j <= bottom; j++){
                result[index++] = matrix[j][right];
            }
            if (left < right && top < bottom){
                for (int i = right-1;i >= left;i--){
                    result[index++] = matrix[bottom][i];
                }
                for (int j = bottom -1;j > top;j--){
                    result[index++] = matrix[j][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        TestM_29_3 t = new TestM_29_3();
        System.out.println(Arrays.toString(t.spiralOrder(nums)));
    }
}
