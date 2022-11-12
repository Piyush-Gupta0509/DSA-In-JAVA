package Arrays;

public class BestTimetoBuyandSellStockIII {
    
    public static int maxProfit(int[] prices) {
        int[] bBuyProfitTillNow = new int[prices.length];
        int[] bSellProfitTillNow = new int[prices.length];
        
        int maxProfit=0;
        int bBuyPoint=0;
        for(int sellday=0; sellday<prices.length; sellday++){
            int profit = prices[sellday] - prices[bBuyPoint];
            if(profit < 0){
                bBuyPoint=sellday;
            }else{
                maxProfit = Math.max(profit, maxProfit);
                bSellProfitTillNow[sellday]=maxProfit;
            }
        }

        int bSellPoint=prices.length-1;
        maxProfit=0;
        for(int buyDay=prices.length-1; buyDay>=0; buyDay--){
            int profit = prices[bSellPoint] - prices[buyDay];
            if(profit < 0){
                bSellPoint=buyDay;
            }
            maxProfit= Math.max(maxProfit, profit);
            bBuyProfitTillNow[buyDay] = maxProfit;
        }

        maxProfit=0;
        for(int i=0;i<prices.length;i++){
            int sum= bBuyProfitTillNow[i]+ bSellProfitTillNow[i];
            if(sum>maxProfit){
                maxProfit=sum;
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(prices));
    }

}
