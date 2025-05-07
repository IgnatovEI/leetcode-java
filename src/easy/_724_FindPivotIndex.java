package easy;

public class _724_FindPivotIndex {
    /**
     * 724. Find Pivot Index
     * @param nums array of integers
     * @return Return the leftmost pivot index. If no such index exists, return -1
     */
    public int pivotIndex(int[] nums) {
        int[] lSum = new int[nums.length];
        int[] rSum = new int[nums.length];

        lSum[0] = 0;
        rSum[nums.length - 1] = 0;

        for (int i = 1; i < lSum.length; i++) {
            lSum[i] += nums[i - 1] + lSum[i - 1];
        }

        for (int i = rSum.length - 2; i >= 0; i--) {
            rSum[i] += nums[i + 1] + rSum[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (lSum[i] == rSum[i]) {
                return i;
            }
        }

        return -1;
    }
}
