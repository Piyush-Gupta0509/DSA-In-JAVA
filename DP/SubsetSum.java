package DP;

import java.util.*;

public class SubsetSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int sum = scn.nextInt();
		
//		------------------------RECURSION CALL------------------------------------------------
		 /*boolean ans=SubsetSumRecursion(arr,n,sum); 
		 System.out.println(ans);*/
		
//		-------------------------TABULATION CALL-------------------------------------------------
		boolean[][] dp = new boolean[n + 1][sum + 1];
		boolean ans = SubsetSumTabulation(arr, n, sum, dp);
		System.out.println(ans);

	}
	
//	------------------------------RECURSION------------------------------------------------
	public static boolean SubsetSumRecursion( int[] arr,int n, int sum) {
		if(sum==0) {
			return true;
		}
		if(n==0) {
			return false;
		}
		
		
		if(arr[n-1]>sum) {
			return SubsetSumRecursion(arr,n-1,sum);
		}
		return SubsetSumRecursion(arr,n-1,sum-arr[n-1]) || SubsetSumRecursion(arr,n-1,sum);
	}
//	------------------------------------------------------------------------------------------

//	---------------------------TABULATION----------------------------------------------------------
	public static boolean SubsetSumTabulation(int[] arr, int n, int sum, boolean[][] dp) {

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < sum + 1; j++) {
				if(i==0) {
					dp[i][j]=false;
				}
				else if(j==0) {
					dp[i][j]=true;
				}
				else {
					if (arr[i - 1] > j) {
						dp[i][j] = dp[i - 1][j];
						
					} else {
						dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
					}
				}
			}
		}

		return dp[n][sum];
	}
//	------------------------------------------------------------------------------------------------

}
