public class factorial {
    public static int calcufactorial(int n) {
        if (n == 1) {
            return 1;
        }
        int fact = calcufactorial(n - 1);
        int ffact = n * fact;
        return ffact;
    }

    public static void main(String[] args) {
        System.out.println(calcufactorial(5));
    }
}
