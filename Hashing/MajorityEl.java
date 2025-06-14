import java.util.*;

public class MajorityEl {

    public static void Majoel(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>(); // ❌ Error 1 fixed
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int nums[] = {1, 3};
        Majoel(nums);
    }
}
