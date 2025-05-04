package medium;

public class _334_IncreasingTripletSubsequence {
    /**
     * 334. Increasing Triplet Subsequence
     * @param nums integer array
     * @return true if there exists a triple of indices (i, j, k)
     * such that i < j < k and nums[i] < nums[j] < nums[k]
     */
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= i) {
                i = num;
            } else if (num <= j) {
                j = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
