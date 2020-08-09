package test.wangyi;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/8
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(maxString(s));
    }

    public static String maxString(String s) {
        int len = s.length();
        int low = 0, high = len - 1;
        if (isPalindrome(s)) return s;
        StringBuffer newS = new StringBuffer(s);
        for (int i = 0; i < len; i++) {
            newS.insert(len +i,s.charAt(i));
            if (isPalindrome(newS.toString())) return newS.toString();
        }

        return newS.toString();
    }

    public static boolean isPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char c1 = s.charAt(low), c2 = s.charAt(high);
            if (c1 == c2) {
                low++;
                high--;
            } else {
                return false;
            }
        }

        return true;
    }
}
