public class maximumsubarray {

    static int fun(int[] num) {
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for (int nu : num) {
            currentsum += nu;
            maxsum = Math.max(maxsum, currentsum);
            if (currentsum < 0) {
                currentsum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int prices1[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int prices2[] = { 5, 4, -1, 7, 8 };
        int prices3[] = { 1 };
        System.out.println(fun(prices1));
        System.out.println(fun(prices2));
        System.out.println(fun(prices3));

    }

}
