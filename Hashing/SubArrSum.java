package Hashing;
import java.util.HashMap;

public class SubArrSum {
    public static void main(String args[]) {
        int arr[] = {10, 2, -2, -20, 10}; // Input array
        int k = -10; // Target sum
        HashMap<Integer, Integer> map = new HashMap<>(); // Stores cumulative sums and their frequencies
        
        // Initialize with sum 0 (empty subarray) having frequency 1
        map.put(0, 1);
        int ans = 0; // Count of subarrays that sum to k
        int sum = 0; // Current cumulative sum
        
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j]; // Update cumulative sum
            
            // Check if there exists a previous cumulative sum such that (sum - k) is found
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            
            // Update the frequency of the current cumulative sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        System.out.println(ans); // Print the result
    }
}
