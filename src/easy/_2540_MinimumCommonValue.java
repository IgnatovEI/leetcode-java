package easy;

import java.util.HashSet;
import java.util.Set;

public class _2540_MinimumCommonValue {
    /**
     * 2540. Minimum Common Value
     * @param nums1 integer array sorted in non-decreasing order
     * @param nums2 integer array sorted in non-decreasing order
     * @return the minimum integer common to both arrays
     */
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int res = -1;

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                return num;
            }
        }

        return res;
    }
}
