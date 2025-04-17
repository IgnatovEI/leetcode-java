package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _49_GroupAnagrams {
    /**
     * 49. Group Anagrams
     * @param strs array of strings
     * @return list of grouped anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> map = new HashMap<>();
        List<List<String>> grouped = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String sorted = sorting(strs[i]);
            map.computeIfAbsent(sorted, s -> new ArrayList<>()).add(i);
        }

        for (List<Integer> idxs : map.values()) {
            List<String> subList = new ArrayList<>();
            for (Integer idx : idxs) {
                subList.add(strs[idx]);
            }
            grouped.add(subList);
        }

        return grouped;
    }

    private String sorting(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
