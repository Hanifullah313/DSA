public class majority {
    static public int majorityElement() {
        int freq ;
        int major = 0;
        //int nums[] = { 1,1,1,1,2,2, 1, 2,1, 1, 2, 2, 3 };
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        int n = nums.length;
        for (int value : nums) {
            freq = 0;
            for (int j :nums) {
                if (value == j) {
                    freq++;
                }
            }
            if (freq > (n / 2)) {
                return value;
            }
        }
       
        return 0;
    }

    public static void main(String[] args) {
        int result = majorityElement();
        System.out.println(result);
    }

}









// class Solution {
//     static public int majorityElement(int nums[]) {
//         int freq;
//         int major = 0;
//         // int nums[] = { 1,1,1,1,2,2, 1, 2,1, 1, 2, 2, 3 };
//         int n = nums.length;
//         for (int value : nums) {
//             freq = 0;
//             for (int j : nums) {
//                 if (value == j) {
//                     freq++;
//                     if (freq > (n / 2)) {
//                         return value;
//                     }
//                 }
//             }
//         }
       
//         return 0;
//     }

//     public static void main(String[] args) {
//         int nums1[] = { 2, 2, 1, 1, 1, 2, 2 };
//         int nums2[] = { 3, 2, 3 };
        
//         System.out.println("Majority Element (Example 2): " + majorityElement(nums2));
//         System.out.println("Majority Element (Example 1): " + majorityElement(nums1));
//     }
// }