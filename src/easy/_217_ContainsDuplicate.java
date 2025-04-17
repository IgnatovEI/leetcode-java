package easy;

import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {
    /**
     * 217. Contains Duplicate
     * @param nums array of integer
     * @return true if any value appears at least twice in the array
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
