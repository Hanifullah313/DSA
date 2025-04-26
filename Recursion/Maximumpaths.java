public class Maximumpaths {

    public static int printmaximumpath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downwords = printmaximumpath(i + 1, j, n, m);
        int Rightpath = printmaximumpath(i, j + 1, n, m);
        return downwords + Rightpath;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
       int totallpaths= printmaximumpath(0, 0, n, m);
       System.out.println(totallpaths);
    }
}
