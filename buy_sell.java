public class buy_sell {

    static int fun(int[] o) {
        int maxProfit = 0;
        
        for (int i = 0; i < o.length - 1; i++) { 
            for (int j = i + 1; j < o.length; j++) {
                int profit = o[j] - o[i]; // Calculate profit
                maxProfit = Math.max(maxProfit, profit); // Update max profit
            }
        }

        return maxProfit; // Return the highest possible profit
    }


    public static void main(String[] args) {
        int prices1[] = { 7, 1, 5, 3, 6, 4 };
        int prices2[] = { 7, 6, 4, 3, 1 };
        int result = fun(prices1);
        int result2 = fun(prices2);
        System.out.println(result);
        System.out.println(result2);

    }
}
