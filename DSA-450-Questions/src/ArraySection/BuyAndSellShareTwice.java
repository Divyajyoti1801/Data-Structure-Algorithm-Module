package ArraySection;

public class BuyAndSellShareTwice {
    public static void main(String args[]) {
        int price[] = new int[] { 10, 22, 5, 75, 65, 80 };
    }

    static int buyAndSellShareTwiceSimple(int arr[]) {
        int profit[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            profit[i] = 0;
        }
        // This code is for finding the maximum Price
        int max_price = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max_price) {
                max_price = arr[i];
            }
            profit[i] = Math.max(profit[i + 1], max_price - arr[i]);
        }
        // This code is for finding the maximum price
        int min_price = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min_price) {
                min_price = arr[i];
            }
            arr[i] = Math.max(profit[i - 1], profit[i] + (arr[i] - min_price));
        }

        int result = profit[arr.length - 1];
        return result;
    }

    static int buyAndSellShareTwiceEfficient(int arr[]) {
        int first_buy = Integer.MIN_VALUE;
        int first_sell = 0;
        int second_buy = Integer.MIN_VALUE;
        int second_sell = 0;
        for (int i = 0; i < arr.length; i++) {
            first_buy = Math.max(first_buy, -arr[i]);
            first_sell = Math.max(first_sell, first_buy + arr[i]);
            second_buy = Math.max(second_buy, first_sell - arr[i]);
            second_sell = Math.max(second_sell, second_buy + arr[i]);
        }
        return second_sell;
    }
}
