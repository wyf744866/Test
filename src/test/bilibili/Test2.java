package test.bilibili;

import java.util.Stack;

/**
 * @author wyf
 * @create 2020/8/13
 */
public class Test2 {
    public boolean IsValidExp(String s) {
        // write code here
        if (s == null || s.length() <= 0) {
            return true;
        }
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }else {
                stack.push(s.charAt(i));
            }

        }
        if (!stack.isEmpty()) return false;
        return true;
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.IsValidExp(""));
    }
}
