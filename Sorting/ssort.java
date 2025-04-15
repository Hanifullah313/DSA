public class ssort {
    static public void print(int a[]) {
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i; // Start with current index as smallest
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j; // Update smallest index if smaller found
                }
            }

            // Swap after finding the smallest in remaining array
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        print(arr); // Output
    }
}
