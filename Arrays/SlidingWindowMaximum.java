package Arrays;
import java.util.*;
import java.util.Arrays;

public class SlidingWindowMaximum {
    
    public static int[] NGER(int[] arr) {
        int[] nger= new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1 ; i>=0; i--) {
           while(st.size()>0 && arr[st.peek()]<arr[i]) {
               st.pop();
           }
           if(st.size()==0) {
               nger[i]=arr.length;
           }
           else {
               nger[i]=st.peek();
           }
           st.push(i);
        }
        System.out.println(Arrays.toString(nger));
        return nger;
    }
    
    
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] nger=NGER(nums);
        int[] ans= new int[nums.length-k+1];
        int sidx=0;
        int eidx=0;
        while(sidx <= nums.length-k) {
            if(sidx>eidx) {
                eidx=sidx;
            }
            while(nger[eidx] < sidx+k) {
                eidx=nger[eidx];
            }
            ans[sidx]=nums[eidx];
            sidx++;
        }
        return ans;
        
        
    }

    public static void main(String[] args) {
        int[] arr= {1,3,-1,-3,5,3,6,7};
        int[] ans=maxSlidingWindow(arr,3);
        System.out.println(Arrays.toString(ans));
    }

}
