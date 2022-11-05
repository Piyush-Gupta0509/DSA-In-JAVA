package Arrays;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		int[] max=new int[prices.length];
        for(int i=prices.length-1;i>=0;i--){
            if(i==prices.length-1) {
            	max[i]=prices[i];
            }
            else {
            	if(prices[i]>max[i+1]) {
            		max[i]=prices[i];
            	}else {
            		max[i]=max[i+1];
            	}
            }
        }
        
        int MaxProfit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++) {
        	int profit=max[i]-prices[i];
        	if(profit>MaxProfit) {
        		MaxProfit=profit;
        	}
        }
        
        System.out.print(MaxProfit);

	}

}
