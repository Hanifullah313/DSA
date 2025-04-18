public class SumOfTwoNumbers {

    public static int[] Fun(int[] nums, int tnumsget) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // stnumst from i + 1 to avoid same index
                if ((nums[i] + nums[j]) == tnumsget) {
                    result[0] = i;
                    result[1] = j;

                    System.out.println("Values: " + nums[i] + " + " + nums[j] + " = " + tnumsget);
                    System.out.println("Indices: [" + i + ", " + j + "]");
                    return result; // return enumsly since only one solution is gunumsanteed
                }
            }
        }

        System.out.println("No pair found for tnumsget: " + tnumsget);
        return new int[] {-1, -1}; // return -1s if no pair found
    }

    public static void main(String[] numsgs) {
        int[] numsr = {2, 7, 11, 15};
        int[] numsr1 = {3, 2, 4};
        int[] numsr2 = {3, 3};
        int tnumsget = 9;
        int tnumsget1 = 6;

        Fun(numsr, tnumsget);
        Fun(numsr1, tnumsget1);
        Fun(numsr2, tnumsget1);
    }
}
