package Stack;

import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElementI {
    public static HashMap<Integer, Integer> NGER(int[] arr) {
        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            if (st.size() == 0) {
                st.push(arr[i]);
                ans[i] = -1;
            } else {
                while (st.size() > 0 && st.peek() <= arr[i]) {
                    st.pop();
                }

                if (st.size() == 0) {
                    st.push(arr[i]);
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                    st.push(arr[i]);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], ans[i]);
        }
        return map;
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        HashMap<Integer, Integer> nger = NGER(nums2);
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nger.get(nums1[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 12, 10, 1 };
        int[] arr2 = { 5, 8, 2, 9, 4, 10, 12, 1, 15, 3 };
        int[] ans = nextGreaterElement(arr1, arr2);
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
