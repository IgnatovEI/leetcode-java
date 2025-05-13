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
        int pos = -1;
        boolean del = false;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                if (del) {
                    l = pos + 1;
                }
                del = true;
                pos = r;
            }
            max = Math.max(max, r - l);

        }

        return max;
    }
}
