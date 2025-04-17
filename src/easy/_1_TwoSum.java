package easy;

import java.util.HashMap;

public class _1_TwoSum {
    /**
     * 1. Two Sum
     * @param nums array of integers
     * @param target target sum integer
     * @return indices of the two numbers such that they add up to target
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int difference;

        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];

            if (map.containsKey(difference)) {
                return new int[]{i, map.get(difference)};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}
