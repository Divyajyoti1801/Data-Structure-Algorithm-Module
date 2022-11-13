package ArraySection;

public class BestTimeToBuyAndSellStock {
    public static void main(String args[]) {
        int[] arr = new int[] { 5, 2, 6, 1, 4 };
        System.out.println("Best Time to Buy and Sell Stock: " + tradeStocks(arr));
    }

    static int tradeStocks(int arr[]) {
        if (arr.length <= 0) {
            return -1;
        }
        int min_so_far = arr[0];
        int max_profit = 0;
        for (int i = 1; i < arr.length; i++) {
            min_so_far = Math.min(arr[i], min_so_far);
            int profit = arr[i] - min_so_far;
            max_profit = Math.max(max_profit, profit);
        }
        return max_profit;

    }
}
