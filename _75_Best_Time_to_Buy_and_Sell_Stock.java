package Two_D_Arrays;

public class _75_Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
/**
 Initialize Variables:

 minPrice: To track the minimum price encountered so far.
 maxProfit: To store the maximum profit encountered.
 Iterate through the array:

 For each price, calculate the potential profit by subtracting the minPrice from the current price.
 Update maxProfit if this profit is greater than the current maxProfit.
 Update minPrice if the current price is lower than the existing minPrice.
 */
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit = 0;
        for(int i = 0 ; i < prices.length; i++){
            if(prices[i]<minPrice)
                minPrice = prices[i];
            profit = prices[i] - minPrice;
            if(profit > maxProfit)
                maxProfit = profit;

        }
    }
}
