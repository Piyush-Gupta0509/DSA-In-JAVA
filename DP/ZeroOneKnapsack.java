package DP;

import java.util.*;

public class ZeroOneKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] value = new int[n];
		int[] weight = new int[n];

		for (int i = 0; i < n; i++) {
			value[i] = scn.nextInt();
		}

		for (int i = 0; i < n; i++) {
			weight[i] = scn.nextInt();
		}

		int capacity = scn.nextInt();

//		------------------------RECURSION CALL------------------------------------------------
		/*
		 * int ans=KnapsackRecursion(value,weight,n,capacity); System.out.println(ans);
		 */

//		------------------------MEMOIZATION CALL------------------------------------------------
		/*
		 * int[][] dp = new int[n + 1][capacity + 1];
		 * 
		 * for(int i=0;i<n+1;i++) { for(int j=0;j<capacity+1;j++) { dp[i][j]=-1; } }
		 * 
		 * int ans = KnapsackMemoization(value, weight, n, capacity, dp);
		 * System.out.println(ans);
		 */

//		-------------------------TABULATION CALL-------------------------------------------------
		int[][] dp = new int[n + 1][capacity + 1];
		int ans = KnapsackTabulation(value, weight, n, capacity, dp);
		System.out.println(ans);

	}

//	------------------------------RECURSION------------------------------------------------
	public static int KnapsackRecursion(int[] value, int[] weight, int n, int capacity) {
		if (n <= 0 || capacity <= 0) {
			return 0;
		}
		int ans1 = value[n - 1] + KnapsackRecursion(value, weight, n - 1, capacity - weight[n - 1]);
		int ans2 = KnapsackRecursion(value, weight, n - 1, capacity);
		return Math.max(ans1, ans2);
	}
//	------------------------------------------------------------------------------------------

//	----------------------------MEMOIZATION--------------------------------------------------
	public static int KnapsackMemoization(int[] value, int[] weight, int n, int capacity, int[][] dp) {
		if (n <= 0 || capacity <= 0) {
			return 0;
		}
		if (dp[n][capacity] != -1) {
			return dp[n][capacity];
		}
		int ans1 = value[n - 1] + KnapsackMemoization(value, weight, n - 1, capacity - weight[n - 1], dp);
		int ans2 = KnapsackMemoization(value, weight, n - 1, capacity, dp);
		return dp[n][capacity] = Math.max(ans1, ans2);
	}
//	------------------------------------------------------------------------------------------------

//	---------------------------TABULATION----------------------------------------------------------
	public static int KnapsackTabulation(int[] value, int[] weight, int n, int capacity, int[][] dp) {
		/*for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < capacity + 1; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				}
			}
		}*/ //not required as all the value inside array is filled with 0

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < capacity + 1; j++) {
				if (weight[i - 1] <= j) {
					dp[i][j] = Math.max(value[i - 1] + dp[i - 1][j - weight[i - 1]], dp[i - 1][j]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[n][capacity];
	}
//	------------------------------------------------------------------------------------------------
}
