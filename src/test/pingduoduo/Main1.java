package test.pingduoduo;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/2
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][6];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        typeNum(nums);
    }

    private static void typeNum(int[][] nums) {
        

    }
    class TouZ{
        int value;
        int left;
        int right;
        int up;
        int down;

        public TouZ(int value, int left, int right, int up, int down) {
            this.value = value;
            this.left = left;
            this.right = right;
            this.up = up;
            this.down = down;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TouZ touZ = (TouZ) o;
            return value == touZ.value &&
                    left == touZ.left &&
                    right == touZ.right &&
                    up == touZ.up &&
                    down == touZ.down;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, left, right, up, down);
        }
    }
}
