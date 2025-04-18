public class printNumber {
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);          // recursive call first
        System.out.println(n); // then print
    }
    

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
