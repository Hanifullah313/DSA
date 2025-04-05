class Solution {
    static public double myPow(double x, long n) {  // Change n to long
        if (n == 0) return 1;  // Base case
        if (n < 0) {
            x = 1 / x;
            n = -n;  // Convert to positive safely
        }
        double half = myPow(x, n / 2);  // Recursive call for n/2
        return (n % 2 == 0) ? half * half : half * half * x;
    }

    public static void main(String[] args) {
        double x1 = 2.00000;
        int y1 = 10;
        double x2 = 2.10000;
        int y2 = 3;
        double x3 = 2.00000;
        int y3 = -2;

        System.out.println(myPow(x1, y1));  // Output: 1024.0
        System.out.println(myPow(x2, y2));  // Output: ~9.261
        System.out.println(myPow(x3, y3));  // Output: 0.25
    }
}
