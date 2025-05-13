package easy;

public class _485_MaxConsecutiveOnes {
    /**
     * 485. Max Consecutive Ones
     * @param nums binary array
     * @return the maximum number of consecutive 1's in the array
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int tmp = 0;

        for (int i : nums) {
            if (i == 1) {
                tmp++;
            } else {
                tmp = 0;
            }
            cnt = Math.max(tmp, cnt);
        }

        return cnt;
    }
}
