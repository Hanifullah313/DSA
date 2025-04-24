public class bsort {

    static public void print(int a[]) {
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 5, 9,7};
        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        print(arr);
    }
}
