package easy;

public class _26_RemoveDuplicatesFromSortedArray {
    /**
     * 26. Remove Duplicates from Sorted Array
     * @param nums sorted in non-decreasing order array of integers,
     * remove the duplicates in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same
     * @return the number of unique elements in nums
     */
    public int removeDuplicates(int[] nums) {
        int p = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                nums[p] = nums[i];
                p++;
            }
        }

        return p;
    }
}
