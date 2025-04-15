public class powerX {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int powerx1 = power(x, n - 1);
        int powerX = x * powerx1;
        return powerX;
    }

    public static void main(String[] args) {
int x =2;
int n =5;
int ans =power(x, n);
System.out.println(ans);
    }
}
