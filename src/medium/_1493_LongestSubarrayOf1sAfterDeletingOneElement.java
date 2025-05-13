package medium;

public class _1493_LongestSubarrayOf1sAfterDeletingOneElement {
    /**
     * 1493. Longest Subarray of 1's After Deleting One Element
     * @param nums binary array
     * @return the size of the longest non-empty subarray containing only 1's in the resulting array
     * Return 0 if there is no such subarray.
     */
    public int longestSubarray(int[] nums) {
        int max = 0;
        int l = 0;
        int z = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) z++;

            while (z > 1) {
                if (nums[l++] == 0) z--;
            }

            max = Math.max(max, r - l + 1 - z);
        }

        return max == nums.length ? max - 1 : max;
    }
}
