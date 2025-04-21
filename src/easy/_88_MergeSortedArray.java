package easy;

import java.util.Arrays;

public class _88_MergeSortedArray {
    /**
     * 88. Merge Sorted Array
     * @param nums1 sorted in non-decreasing order array of integers
     * @param m number of elements in nums1
     * @param nums2 sorted in non-decreasing order array of integers
     * @param n number of elements in nums2
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * The final sorted array should not be returned by the function,
     * but instead be stored inside the array nums1. To accommodate this,
     * nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
     * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j : nums2) {
            nums1[m] = j;
            m++;
        }
        Arrays.sort(nums1);
    }
}
