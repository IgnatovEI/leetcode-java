package easy;

public class _283_MoveZeroes {
    /**
     * 283. Move Zeroes
     * @param nums array of integers,
     * move all 0's to the end of it while maintaining the relative order of the non-zero elements
     */
    public void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
