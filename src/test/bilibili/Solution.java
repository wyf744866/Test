package test.bilibili;

/**
 * @author wyf
 * @create 2020/8/13
 */
public class Solution {
    char[] com1 = {'+', '-', '*', '/'};

    public boolean Game24Points(int[] arr) {
        // write code here
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (caculate(arr, i, j)) return true;
                if (caculate2(arr, i, j)) return true;
            }
        }

        return false;
    }

    private boolean caculate2(int[] arr, int i, int j) {
        double a = arr[1] * arr[2];
        double b = arr[1] / arr[2];
        if (com1[i] == '+' && j <= 1) {
            if (com1[j] == '+') {
                if (a + arr[0] + arr[3] == 24 || b + arr[0] + arr[3] == 24) return true;
            } else {
                if (a + arr[0] - arr[3] == 24 || b + arr[0] - arr[3] == 24) return true;
            }
        }
        if (com1[i] == '-' && j != 2 && j != 3) {
            if (com1[j] == '+') {
                if (arr[0] - a + arr[3] == 24 || arr[0] - b + arr[3] == 24) return true;
            } else {
                if (arr[0] - a - arr[3] == 24 || arr[0] - b - arr[3] == 24) return true;
            }
        }
        if (i > 1) {
            double a1 = 0, b1 = 0;
            if (com1[i] == '*') {
                a1 = a * arr[0];
                b1 = b * arr[0];
            } else {
                a1 = arr[0]/a;
                b1 = arr[0]/b;
            }
            if (com1[j] == '+') {
                if (a1 + arr[3] == 24 || b1 + arr[3] == 24) return true;
            }
            if (com1[j] == '-') {
                if (a1 - arr[3] == 24 || b1 - arr[3] == 24) return true;
            }
            if (com1[j] == '*') {
                if (a1 * arr[3] == 24 || b1 * arr[3] == 24) return true;
            }
            if (com1[j] == '/') {
                if (a1 / arr[3] == 24 || b1 / arr[3] == 24) return true;
            }
        }
        if (j > 1 && i <= 1) {
            double a1 = 0, b1 = 0;
            if (com1[j] == '*') {
                a1 = a * arr[3];
                b1 = b * arr[3];
            } else {
                a1 = a / arr[3];
                b1 = b / arr[3];
            }
            if (com1[i] == '+') {
                if (arr[0] + a1 == 24 || arr[0] + b1 == 24) return true;
            }
            if (com1[i] == '-') {
                if (arr[0] - a1 == 24 || arr[0] - b1 == 24) return true;
            }
            if (com1[i] == '*') {
                if (arr[0] * a1 == 24 || arr[0] * b1 == 24) return true;
            }
            if (com1[i] == '/') {
                if (arr[0] / a1 == 24 || arr[0] / b1 == 24) return true;
            }
        }
        return false;
    }

    private boolean caculate(int[] arr, int i, int j) {
        int a = 0, b = 0;
        if (com1[i] == '+') {
            a = arr[0] + arr[1];
        }
        if (com1[i] == '-') {
            a = arr[0] - arr[1];
        }
        if (com1[i] == '*') {
            a = arr[0] * arr[1];
        }
        if (com1[i] == '/') {
            a = arr[0] / arr[1];
        }
        if (com1[j] == '+') {
            b = arr[2] + arr[3];
        }
        if (com1[j] == '-') {
            b = arr[2] - arr[3];
        }
        if (com1[j] == '*') {
            b = arr[2] * arr[3];
        }
        if (com1[j] == '/') {
            b = arr[2] / arr[3];
        }
        return a + b == 24 || a - b == 24;
    }


}
