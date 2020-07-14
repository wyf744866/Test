package testforday4;

import java.nio.file.Path;

/**
 * @author wyf
 * @create 2020/7/6
 */
public class Test63 {

     int path = 1;
     //有误

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) return 0;
        if (nextGrid(obstacleGrid, 0, 0)) return path;
        return 0;
    }

    private boolean nextGrid(int[][] obstacleGrid, int i, int j) {
        if (i >= obstacleGrid.length ||
                j >= obstacleGrid[0].length || obstacleGrid[i][j] == 1) return false;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        boolean[] temp = new  boolean[2];
        if (nextGrid(obstacleGrid, i + 1, j)) {
            temp[0] = true;
        }
        if ( nextGrid(obstacleGrid, i, j + 1)) {
            temp[1] = true;
        }
        if (temp[0] && temp[1]) {
            path++;
        }
        if (!temp[0] && !temp[1]){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Test63 t = new Test63();
        int[][] nums = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(t.uniquePathsWithObstacles(nums));
    }
}
