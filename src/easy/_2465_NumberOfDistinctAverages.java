package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _2465_NumberOfDistinctAverages {
    /**
     * 2465. Number of Distinct Averages
     * @param nums 0-indexed integer array nums of even length
     * @return the number of distinct averages calculated using the above process.
     */
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();

        int p = nums.length - 1;
        double avg;

        for(int i = 0; i < nums.length /2; i++) {
            avg = (nums[i] + nums[p]) / 2.0;
            p--;
            set.add(avg);
        }

        return set.size();
    }
}
