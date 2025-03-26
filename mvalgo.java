import java.util.*;
public class mvalgo {
    static public int majorityElement() {
        int freq = 0;
        int ans = 0;
        int nums[] = {2,2,1};

        for (int i = 0; i < nums.length; i++) {
            if (freq == 0) {
                ans = nums[i];
            }
            if (ans == nums[i]) {
                freq++;
            } else {
                freq--;
            }
            
        }

        return ans;
    }

    public static void main(String[] args) {
        int result = majorityElement();
        System.out.println(result);
    }

}
