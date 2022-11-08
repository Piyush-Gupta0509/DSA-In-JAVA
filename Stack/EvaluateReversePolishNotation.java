package Stack;

import java.util.*;

public class EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        
        Stack<Integer> st=new Stack<>();
        for (String str : tokens) {
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                int v2=st.pop();
                int v1=st.pop();
                int val=solve(str,v1,v2);
                st.push(val);
            }
            else {
                st.push(Integer.parseInt(str));
            }
        }
        return st.pop();
    }
    
    public static int solve(String op, int v1, int v2) {
        if(op.equals("+")) return v1+v2;
        if(op.equals("-")) return v1-v2;
        if(op.equals("*")) return v1*v2;
        return v1/v2;
    }

    public static void main(String[] args) {
        String[] str = { "2","1","+","3","*" };
        System.out.println(evalRPN(str));
    }

}
