package DP;

import java.util.Scanner;

public class UnboundedKnapSack {

	public static void main(String[] args) {
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
		int[][] dp = new int[n + 1][capacity + 1];
		int ans = UnboundedKnapsackTabulation(value, weight, n, capacity, dp);
		System.out.println(ans);

	}
	public static int UnboundedKnapsackTabulation(int[] value, int[] weight, int n, int capacity, int[][] dp) {
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
					dp[i][j] = Math.max(value[i - 1] + dp[i][j - weight[i - 1]], dp[i - 1][j]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[n][capacity];
	}

}
