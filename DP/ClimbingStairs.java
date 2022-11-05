package DP;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 44;
		int ans = climbStairs(n);
		System.out.println(ans);
	}

//	-------------------------RECURSION----------------------------------
//	public static int climbStairs(int n) {
//		if (n <= 1) {
//			return 1;
//		}
//		int op1=climbStairs(n-1);
//		int op2=climbStairs(n-2);
//		return op1+op2;
//	}
	
	
//	--------------------MEMOIZATION----------------------------------------
	public static int climbStairs(int n) {
		int[] dp=new int[n+1];
		int ans=memo(n,dp);
		return ans;
	}
	
	public static int memo(int n,int[] dp) {
		if(n<=1) {
			dp[n]= 1;
            return dp[n];
		}
		if(dp[n]>0) {
			return dp[n];
		}
		int op1=memo(n-1,dp);
		int op2=memo(n-2,dp);
		
		dp[n]=op1+op2;
        return dp[n];
	}

}
