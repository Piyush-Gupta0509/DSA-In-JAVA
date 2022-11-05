package DP;

import java.util.*;
public class CoinChangeCombination {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] denomination=new int[n+1];
		
		for(int i=0;i<n;i++) {
			denomination[i]=scn.nextInt();
		}
		
		int amt=scn.nextInt();
		int[][] dp = new int[n + 1][amt + 1];
		int ans = CoinChangeCombinationTabulation(denomination, n, amt, dp);
		System.out.println(ans);

	}
	public static int CoinChangeCombinationTabulation(int[] denomination , int n, int amt, int[][] dp) {
		

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < amt + 1; j++) {
				if(i==0) {
					dp[i][j]=0;
				}
				else if(j==0){
					dp[i][j]=1;
				}
				else {
					if (denomination[i - 1] <= j) {
						dp[i][j] = dp[i][j - denomination[i - 1]] + dp[i - 1][j];
					} else {
						dp[i][j] = dp[i - 1][j];
					}
				}
			}
		}

		return dp[n][amt];
	}
}
