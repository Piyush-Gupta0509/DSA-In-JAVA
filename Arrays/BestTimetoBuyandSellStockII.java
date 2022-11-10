package Arrays;

public class BestTimetoBuyandSellStockII {
    public static int maxProfit(int[] prices) {
        int ans=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]> prices[i-1]){
                ans+= prices[i]- prices[i-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr= {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));

    }

}
