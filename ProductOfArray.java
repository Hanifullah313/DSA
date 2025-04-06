import java.util.Arrays;

public class ProductOfArray {
    static public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] ans = new int[nums.length];

        // Initialize prefix and suffix arrays
        prefix[0] = 1;
        suffix[nums.length - 1] = 1;  // ✅ Fix

        // Compute prefix products
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Compute suffix products
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // Compute final answer
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int num1[] = { 1, 2, 3, 4 };
        int num2[] = { -1, 1, 0, -3, 3 };

        // ✅ Properly print the arrays using Arrays.toString()
        System.out.println(Arrays.toString(productExceptSelf(num1)));  // Output: [24, 12, 8, 6]
        System.out.println(Arrays.toString(productExceptSelf(num2)));  // Output: [0, 0, 9, 0, 0]
    }
}
