package doublepointers;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] days = {7, 1, 5, 3, 6, 4};
        //days = new int[]{7, 6, 4, 3, 1};
        System.out.println(maxProfit(days));
    }

    public static int maxProfit(int[] prices) {
        int smallerPrice = 100000;
        int profit = 0;
        int today = 0;
        for (int price : prices) {
            if (price < smallerPrice) {
                smallerPrice = price;
            }
            today = price - smallerPrice;
            if (today > profit) {
                profit = today;
            }
        }
        return profit;
    }
}
