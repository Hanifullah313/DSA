public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8, 7};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // QuickSort function
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pIdx = partition(arr, low, high); // partition index
            quickSort(arr, low, pIdx - 1); // left part
            quickSort(arr, pIdx + 1, high); // right part
        }
    }

    // Partition function
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Choose last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap pivot into correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Return pivot index
    }
}
