package medium;

public class _53_MaximumSubarray {
    /**
     * 53. Maximum Subarray
     * @param nums integer array
     * @return find the subarray with the largest sum, and return its sum
     */
    public int maxSumArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], nums[i] + currSum);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
