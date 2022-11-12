package Arrays;



public class BestTimetoBuyandSellStockIV {
    
    
    public static int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][] dp=new int[k+1][n];

        for(int t=1 ;t<=k; t++){
            for(int d=1; d<n; d++){
                int maxVal = dp[t][d-1];
                for(int pd=0; pd<d; pd++){
                    int profit = dp[t-1][pd] + prices[d]-prices[pd];
                    if(profit > maxVal){
                        maxVal=profit;
                    } 
                }
                dp[t][d]=maxVal;
            }
        }

        int ans=0;
        for(int d=0 ;d<n; d++){
            if(dp[k][d] > ans){
                ans=dp[k][d];
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3};
        int k=2;
        System.out.println(maxProfit(k,prices));

    }

}
