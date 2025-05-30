package easy;

import java.util.ArrayList;
import java.util.List;

public class _448_FindAllNumbersDisappearedInAnArray {
    /**
     * 448. Find All Numbers Disappeared in an Array
     * @param nums array of n integers where nums[i] is in the range [1, n]
     * @return an array of all the integers in the range [1, n] that do not appear in nums
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i : nums) {
            int idx = Math.abs(i) - 1;
            if (nums[idx] > 0) {
                nums[idx] *= -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
