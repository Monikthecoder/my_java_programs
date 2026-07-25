
/**
 *
 * Buy & Sell Stocks
 *
 *  *You are given an array prices where prices[i] is the price of a given stock
 * *on the ith day. You want to maximize your profit by choosing a single day to
 * *buy one stock and choosing a different day in the future to sell that stock.
 * *Return the maximum profit you can achieve from this transaction. If you
 * *cannot achieve any profit, return 0.
 *
 *
 */
class BuyandSellStocks {

    // By Me
    public static int bestDaytobuyStock(int[] numbers) {
        int max_profit = 0;
        //    int recent_profit;
        int buy_price = numbers[0];
        int sell_price;

        for (int i = 1; i < numbers.length; i++) {

            sell_price = numbers[i];

            if (buy_price < numbers[i]) {
                int recent_profit = sell_price - buy_price;
                buy_price = numbers[i];
                max_profit = Math.max(recent_profit, max_profit);
            } else {
                buy_price = sell_price;
            }

            // buy_price = numbers[i];
        }
        return max_profit;
    }

    // By Apna college
    public static int BuyandSellStokes(int[] numbers) {
        int buyingPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (buyingPrice < numbers[i]) {
                int profit = numbers[i] - buyingPrice;
                MaxProfit = Math.max(profit, MaxProfit);
            } else {
                buyingPrice = numbers[i];
            }
        }
        return MaxProfit;
    }

    public static void main(String[] args) {
        int[] numbers = {7, 1, 5, 3, 6, 4};
        System.out.println("maximum profit is " + BuyandSellStokes(numbers));
    }
}
