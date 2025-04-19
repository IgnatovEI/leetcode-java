package easy;

public class _35_SearchInsertPosition {
    /**
     * 35. Search Insert Position
     * @param nums sorted array of distinct integers
     * @param target value
     * @return the index if the target is found. If not,
     * return the index where it would be if it were inserted in order
     */
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i] || target < nums[i]) {
                return i;
            }
        }

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        return -1;
    }
}
