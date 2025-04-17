package easy;

public class _27_RemoveElement {
    /**
     * 27. Remove Element
     * @param nums array of integers
     * @param val integer,
     * remove all occurrences of val in nums in-place.
     * The order of the elements may be changed
     * @return the number of elements in nums which are not equal to val
     */
    public int removeElement(int[] nums, int val) {
        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[p] = nums[i];
                p++;
            }
        }

        return p;
    }
}
