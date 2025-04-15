public class powerxNlogn {
    public static int power(int x, int n) {
        if (n == 0) return 1;
        if (x == 0) return 0;

        int halfPower = power(x, n / 2);

        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = power(x, n);
        System.out.println(ans);  
        
    }
}
