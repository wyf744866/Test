package test.didi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/21
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        matchNums(n);
    }

    private static void matchNums(int n) {
        int a = n / 200;  //或a = n/200-1;
        int num = n - a * 200;
        if (a == 0 || num >= 199) {
            System.out.println(0);
            return;
        }
        List<int[]> nums = new ArrayList<>();
        for (int b = 0; b < 9; b++) {
            for (int c = 0; c < 9; c++) {
                if (b != a && b != c && c != a) {
                    int bc = b * 10 + c;
                    int cc = c * 10 + c;
                    if (bc + cc == num) {
                        if (bc < cc) {
                            nums.add(new int[]{bc + a * 100, cc + a * 100});
                        } else {
                            nums.add(new int[]{cc + a * 100, bc + a * 100});
                        }
                    }
                }
            }
        }
        System.out.println(nums.size());
        for (int[] ints : nums) {
            System.out.print(ints[0]);
            System.out.print(" ");
            System.out.println(ints[1]);
        }
    }

}


