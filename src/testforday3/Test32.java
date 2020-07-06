package testforday3;

import java.util.ArrayDeque;
import java.util.Deque;
;

/**
 * @author wyf
 * @create 2020/7/4
 */
public class Test32 {
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int result = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                stack.push(i);
            }else {
                stack.pop();
                if (stack.isEmpty()){
                    stack.push(i);
                }else {
                    result = Math.max(result,i - stack.peek());
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Test32 t = new Test32();
        System.out.println(t.longestValidParentheses(")()())"));
    }
}
