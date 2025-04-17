package easy;

public class _136_SingleNumber {
    /**
     * 136. Single Number
     * @param nums non-empty array of integers,
     * every element appears twice except for one
     * @return single one integer
     */
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
