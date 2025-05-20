package easy;

public class _1480_RunningSumOf1dArray {
    /**
     * 1480. Running Sum of 1d Array
     * @param nums array of integers
     * @return the running sum of nums
     */
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i] + ans[i - 1];
        }

        return ans;
    }
}
