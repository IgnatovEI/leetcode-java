package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2215_FindTheDifferenceOfTwoArrays {
    /**
     * 2215. Find the Difference of Two Arrays
     * @param nums1 integer array
     * @param nums2 integer array
     * @return a list answer of size 2 where:
     * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
     * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
     */
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int n : nums1) s1.add(n);
        for (int n : nums2) s2.add(n);

        for (int n : nums2) {
            if (s1.contains(n)) {
                s1.remove(n);
                s2.remove(n);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(s1));
        res.add(new ArrayList<>(s2));

        return res;
    }
}
