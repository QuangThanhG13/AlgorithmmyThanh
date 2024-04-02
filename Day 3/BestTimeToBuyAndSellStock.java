package baicodethieunhi;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int currentProfit = prices[i] - buyPrice;
                profit = Math.max(currentProfit, profit);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 7 , 1, 4, 5, 6, 9 ,3, 5};
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int maxProfit = bestTimeToBuyAndSellStock.maxProfit(prices);
        System.out.println(" Maxium profit : " + maxProfit);
    }
}
