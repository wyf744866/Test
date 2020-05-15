package testforday;

import java.util.Stack;

/**
 * @author wyf
 * @date 2020/5/12 - 17:15
 */
public class Test155 {

}
class MinStack {
    Stack<Integer> mystack;
    Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        this.mystack = new Stack<Integer>();
        this.min = new Stack<Integer>();
    }

    public void push(int x) {
       mystack.push(x);
        if (min.isEmpty()) {
            min.push(x);
        }else {
            if (x < min.peek())
                min.push(x);
        }
    }

    public void pop() {
        int num = mystack.pop();
        if (num == min.peek()) min.pop();
    }

    public int top() {
        return  mystack.peek();
    }

    public int getMin() {
         if (min.isEmpty()){
             return  Integer.MAX_VALUE;
         }
         return  min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */