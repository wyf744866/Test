package testforday2;

import java.util.ArrayDeque;
import java.util.Deque;


/**
 * @author wyf
 * @create 2020/6/11
 */
public class Test739_2 {
    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] days = new int[len];
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = 0; i < len; i++) {
            int tem = T[i];
            while (!stack.isEmpty() && T[stack.peekLast()] < tem){
                int j = stack.removeLast();
                days[j] = i-j;
            }
            stack.addLast(i);
        }
        return days;
    }
}
