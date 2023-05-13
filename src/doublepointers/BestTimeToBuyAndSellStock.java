package doublepointers;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] days = {7, 1, 5, 3, 6, 4};
        days = new int[]{7, 6, 4, 3, 1};
        System.out.println(maxProfit(days));
    }

    public static int maxProfit(int[] prices) {
        int left = 0;
        int profit = 0;
        while (left < prices.length) {
            int right = left;
            while (right < prices.length) {
                if (prices[right] - prices[left] > profit) {
                    profit = prices[right] - prices[left];
                }
                right++;
            }
            left++;
        }
        return profit;
    }
}
