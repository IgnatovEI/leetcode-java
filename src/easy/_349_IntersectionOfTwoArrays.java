package easy;

import java.util.HashSet;
import java.util.Set;

public class _349_IntersectionOfTwoArrays {
    /**
     * 349. Intersection of Two Arrays
     * @param nums1 integer arrays
     * @param nums2 integer arrays
     * @return an array of their intersection.
     * Each element in the result must be unique, and you may return the result in any order
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        int[] result = new int[common.size()];
        int i = 0;
        for (int num : common) {
            result[i++] = num;
        }

        return result;
    }
}
