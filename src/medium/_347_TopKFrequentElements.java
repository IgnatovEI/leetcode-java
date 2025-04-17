package medium;

import java.util.HashMap;
import java.util.Map;

public class _347_TopKFrequentElements {
    /**
     * 347. Top K Frequent Elements
     * @param nums array of integers
     * @param k integer
     * @return the k most frequent elements
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
