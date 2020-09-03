package test.aiqiyi;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author wyf
 * @create 2020/8/23
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(IsValidExp(s));
    }

    public static String IsValidExp(String s) {
        // write code here
        if (s == null || s.length() <= 0) {
            return "True";
        }
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return "False";
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return "False";
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return "False";
            } else {
                stack.push(s.charAt(i));
            }

        }
        if (!stack.isEmpty()) return "False";
        return "True";
    }


}
