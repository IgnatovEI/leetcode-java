package medium;

public class _11_ContainerWithMostWater {
    /**
     * 11. Container With Most Water
     * @param height integer array of length n
     * There are n vertical lines drawn such that the two endpoints
     * of the ith line are (i, 0) and (i, height[i])
     * @return the maximum amount of water a container can store
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0, r = height.length - 1;

        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            maxArea = Math.max(area, maxArea);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }

        }

        return maxArea;
    }
}
