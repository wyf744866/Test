package testforday6;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wyf
 * @create 2020/8/16
 */
public class Test733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image, sr, sc, newColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int newColor) {
        int[] x = {1, -1, 0, 0};
        int[] y = {0, 0, -1, 1};
        int oldColor = image[sr][sc];
        if (oldColor == newColor) return;
        image[sr][sc] = newColor;
        for (int k = 0; k < 4; k++) {
            int xi = sr + x[k];
            int yi = sc + y[k];
            if (xi >= 0 && xi < image.length && yi >= 0 && yi < image[0].length && image[xi][yi] == oldColor) {
                dfs(image, xi, yi, newColor);
            }
        }

    }

    public int[][] floodFill2(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        int[] x = {1, -1, 0, 0};
        int[] y = {0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});
        int oldColor = image[sr][sc];
        while (!queue.isEmpty()) {
            int[] a = queue.poll();
            image[a[0]][a[1]] = newColor;
            for (int i = 0; i < 4; i++) {
                int xi = a[0] + x[i];
                int yi = a[1] + y[i];
                if (xi >= 0 && xi < image.length && yi >= 0 && yi < image[0].length && image[xi][yi] == oldColor) {
                    queue.add(new int[]{xi, yi});
                }
            }

        }
        return image;
    }
}
