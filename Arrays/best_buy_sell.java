class best_buy_sell {
    public static void main(String[] args) {
        int stocks[] = { 3, 2, 1, 6, 7, 3, 2 };
        int result = best_profit(stocks);
        System.out.println("Best Profit: " + result);
    }

    public static int best_profit(int arr[]) {
        int current_profit = 0;
        int overall_profit = 0;
        int buy = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            // Logic
            if (buy > arr[i])
                buy = arr[i];
            current_profit = arr[i] - buy;

            if (current_profit > overall_profit) {
                overall_profit = current_profit;
            }

        }
        return overall_profit;
    }
}