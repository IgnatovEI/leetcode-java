package medium;

public class _1004_MaxConsecutiveOnesIII {
    /**
     * 1004. Max Consecutive Ones III
     * @param nums binary array
     * @param k integer
     * @return the maximum number of consecutive 1's in the array
     * if you can flip at most k 0's
     */
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int l = 0;
        int z = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) z++;

            while (z > k) {
                if (nums[l++] == 0) z--;
            }

            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
