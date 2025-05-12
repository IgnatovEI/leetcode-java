package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _1207_UniqueNumberOfOccurrences {
    /**
     * 1207. Unique Number of Occurrences
     * @param arr array of integers
     * @return true if the number of occurrences of each value
     * in the array is unique or false otherwise
     */
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(map.values());

        return map.size() == set.size();
    }
}
