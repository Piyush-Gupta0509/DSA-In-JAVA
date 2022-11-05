package DP;

import java.util.Scanner;

public class CoinChangePermutation {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] denomination=new int[n];
		
		for(int i=0;i<n;i++) {
			denomination[i]=scn.nextInt();
		}
		
		int tar=scn.nextInt();
		int[] dp = new int[tar+1];
		dp[0]=1;
		for(int amt=1;amt<tar+1;amt++) {
			for(int coin:denomination) {
				if(coin<=amt) {
					dp[amt]+=dp[amt-coin];
				}
			}
		}
		
		System.out.println(dp[tar]);

	}

}
