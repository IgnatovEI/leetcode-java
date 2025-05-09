package medium;

import java.util.Arrays;

public class _1679_MaxNumberOfKSumPairs {
    /**
     * 1679. Max Number of K-Sum Pairs
     * @param nums integer array
     * @param k integer
     * @return the maximum number of operations you can perform on the array
     */
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int cnt = 0;

        for (int l = 0, r = nums.length - 1; l < r; ) {
            if (k >= nums[r]) {
                if (nums[l] == k - nums[r]) {
                    cnt++;
                    l++;
                    r--;
                } else if (nums[l] < k - nums[r]){
                    l++;
                } else {
                    r--;
                }
            } else {
                r--;
            }
        }

        return cnt;
    }
}
