public class Main {
    public  static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;
        boolean isBuy = false;
        for (int i= 1 ; i < n; i++){
            if (prices[i] > prices[i-1])
            maxProfit += prices[i] - prices[i-1];
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }
}