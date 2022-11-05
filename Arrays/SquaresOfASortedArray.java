package Arrays;

import java.util.*;

public class SquaresOfASortedArray {

	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
//		-------------------------BRUTE FORSE SOLUION-----------------------------
//		int[] ans = new int[nums.length];
//		for (int i = 0; i < nums.length; i++) {
//			ans[i] = nums[i] * nums[i];
//		}
//		
//		Arrays.sort(ans);
//		for (int n : ans) {
//			System.out.println(n);
//		}
		
//		----------------------OPTIMISED SOLUTION-----------------------------------
		int[] ans = new int[nums.length];
		int st=0;
		int last=nums.length-1;
		int k=nums.length-1;
		while(st<=last) {
			int stValue=nums[st]*nums[st];
			int lastValue=nums[last]*nums[last];
			if(stValue>lastValue) {
				ans[k]=stValue;
				k--;
				st++;
			}
			else {
				ans[k]=lastValue;
				k--;
				last--;
			}
		}
		for (int n : ans) {
			System.out.println(n);
		}
	}

}
