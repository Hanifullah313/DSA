public class towerOFhanio {
    public static void towerofhanio(int n, String src, String helper, String dis) {
        if (n == 1) {
            System.out.println("transfer Disk  " + n + " from " + src + " to " + dis);
            return;
        }
        towerofhanio(n - 1, src, dis, helper);
        System.out.println("transfer Disk  " + n + " from " + src + " to " + dis);
        towerofhanio(n - 1, helper, src, dis);
    }

    public static void main(String[] args) {
        int n = 3;
        towerofhanio(n, "s", "h", "D");
    }
}
