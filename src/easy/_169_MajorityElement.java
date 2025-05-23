package easy;

import java.util.HashMap;
import java.util.Map;

public class _169_MajorityElement {
    /**
     * 169. Majority Element
     * @param nums array of integers
     * @return the majority element
     * The majority element is the element that appears more than ⌊n / 2⌋ times
     * You may assume that the majority element always exists in the array
     */
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) > nums.length / 2) {
                ans = i;
            }
        }

        return ans;
    }
}
