public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans^  nums[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
        int nums1[] = { 2, 2, 1};
        int nums2[] = { 4, 1, 2, 1, 2 };
        System.out.println(obj.singleNumber(nums1));
        System.out.println(obj.singleNumber(nums2));
    }
}