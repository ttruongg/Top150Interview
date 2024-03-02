public class Main {

    //solution 1 time limit exceeded
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if (n > 1) {
            int result = prices[1] - prices[0];
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int tmp = prices[j] - prices[i];
                    if (tmp > result) {
                        result = tmp;
                    }
                }
            }
            if (result > 0)
                return result;
        }
        return 0;
    }


    //solution 2
    public static int maxProfit2(int[] prices) {
        int n = prices.length;
        int buyPrice = prices[0];
        int currentProfit = 0;
        int maxProfit = 0;
        if (n > 1){
            for (int i = 1; i < n; i++){
                if (prices[i] < buyPrice){
                    buyPrice = prices[i];
                }
                currentProfit = prices[i] - buyPrice;
                if (currentProfit > maxProfit){
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit2(prices));
    }
}