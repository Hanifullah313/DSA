public class mostwater {

    static public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int maxarea = 0;
        while (left < right) {
            int width = right - left;
            int hight = Math.min(height[left], height[right]);
            int area = hight * width;
            maxarea = Math.max(maxarea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxarea;
    }

    public static void main(String[] args) {
        int container1[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int container2[] = { 1, 1 };
        System.out.println(maxArea(container1));
        System.out.println(maxArea(container2));
    }
}
