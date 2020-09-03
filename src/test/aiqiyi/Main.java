package test.aiqiyi;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/23
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(CountZero1(n));
    }
    private static int CountZero1(int n) {
        int ret = 0;
        while (n > 0){
            ret += n/5;
            n = n/5;
        }
        return ret;
    }
    private static int CountZero(int n) {
        if (n == 0) return 1;
        int count = 0;
        int nNum = 1;
        for (int i = 1; i <= n; i++) {
            nNum = nNum * i;
            while (nNum %10 == 0 ){
                count++;
                nNum =nNum/10;
            }

        }
/*        String s = String.valueOf(nNum);
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) - '0' == 0) {
                count++;
            } else {
                break;
            }
        }*/
        return count;
    }
}
