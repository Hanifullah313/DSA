public class insort {
    static public void print(int a[]) {
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " "); 
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 }; 
        // Start insertion sort from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; // Store the current element to be inserted
            int j = i - 1;         // Set j to the last index of the sorted part (left of current)

            // Move elements greater than current to one position ahead
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j--; // Move to the previous element
            }

            // Insert the current element at its correct position
            arr[j + 1] = current;
        }

        print(arr);
    }
}
