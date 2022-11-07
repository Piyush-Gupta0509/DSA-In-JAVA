package Stack;

import java.util.*;

public class minStack {
    static class MinStack {

        Stack<Integer> st;
        Stack<Integer> mst;

        public MinStack() {
            st = new Stack<Integer>();
            mst = new Stack<Integer>();
        }

        public void push(int val) {
            st.push(val);
            if (mst.size() == 0 || (val <= mst.peek())) {
                mst.push(val);
            }

        }

        public void pop() {
            int val = st.pop();
            if (mst.peek() == val) {
                mst.pop();
            }

        }

        public int top() {
            return st.peek();
        }

        public int getMin() {
            // System.out.println(mst.size());
            return mst.peek();
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
