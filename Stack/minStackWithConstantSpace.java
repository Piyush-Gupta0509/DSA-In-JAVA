package Stack;

import java.util.*;

public class minStackWithConstantSpace {
    static class MinStack {

        Stack<Integer> st;
        int min;

        public MinStack() {
            st = new Stack<Integer>();
            min = Integer.MAX_VALUE;
        }

        public void push(int val) {
            if (val <= min) {
                st.push(min);
                min = val;
            }
            st.push(val);

        }

        public void pop() {
            if (st.pop() == min) {
                min = st.pop();
            }
        }

        public int top() {
            return st.peek();
        }

        public int getMin() {
            return min;
        }
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(512);
        obj.push(-1024);
        obj.push(-1024);
        obj.push(512);
        obj.pop();
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());

    }
}
