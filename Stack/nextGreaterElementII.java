package Stack;

import java.util.Stack;

public class nextGreaterElementII {

    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<Integer>();

        // Pre Processing
        for (int i = nums.length - 1; i >= 0; i--) {
            while(st.size() > 0 && nums[i]>=st.peek()) {
                st.pop();
            }
            
            st.push(nums[i]);
        }
        
        // Now same code for next greater element right
        int ans[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {

            if (st.size() == 0) {
                st.push(nums[i]);
                ans[i] = -1;
            } else {
                while (st.size() > 0 && st.peek() <= nums[i]) {
                    st.pop();
                }

                if (st.size() == 0) {
                    st.push(nums[i]);
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                    st.push(nums[i]);
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums= {5,4,3,2,1};
        int[] ans= nextGreaterElements(nums);
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }

}
