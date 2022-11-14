package Arrays;

public class BestTimetoBuyandSellStockwithTransactionFee {
    public static int maxProfit(int[] prices, int fee) {
        int buy = -prices[0];
        int sell = 0;

        for (int i = 0; i < prices.length; i++) {
            int nbuy = sell - prices[i];
            int nsell = buy + prices[i] - fee;
            buy = Math.max(buy, nbuy);
            sell = Math.max(nsell, sell);
            System.out.println(buy+" "+sell);
        }
        return sell;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 8, 4, 9 };
        System.out.println(maxProfit(arr, 2));
    }

}
