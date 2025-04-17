package easy;

public class _268_MissingNumber {
    /**
     * 268. Missing Number
     * @param nums array of integers containing n distinct numbers in the range [0, n]
     * @return the only number in the range that is missing from the array
     */
    public int missingNumber(int[] nums) {
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }

        return res;
    }
}
