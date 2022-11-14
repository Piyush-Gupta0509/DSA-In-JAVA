package Arrays;

public class BestTimetoBuyandSellStockwithCooldown {

    public static int maxProfit(int[] prices) {
        int buy = -prices[0];
        int sell = 0;
        int coolDown = 0;

        for (int i = 0; i < prices.length; i++) {
            int nbuy= -prices[i]+coolDown;
            int nsell= prices[i]+buy;
            coolDown=sell;
            buy=Math.max(buy, nbuy);
            sell=Math.max(nsell, sell);
        }
        return sell;

    }

    public static void main(String[] args) {
        int[] arr= {10,15,17,20,16,18,22,20,22,20,23,25};
        System.out.println(maxProfit(arr));
    }

}
