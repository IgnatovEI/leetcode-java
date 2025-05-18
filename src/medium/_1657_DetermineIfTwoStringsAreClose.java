package medium;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class _1657_DetermineIfTwoStringsAreClose {
    /**
     * 1657. Determine if Two Strings Are Close
     * @param word1 string
     * @param word2 string
     * @return true if word1 and word2 are close, and false otherwise
     */
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> freq1 = getFrequencyMap(word1);
        Map<Character, Integer> freq2 = getFrequencyMap(word2);

        if (!freq1.keySet().equals(freq2.keySet())) {
            return false;
        }

        List<Integer> values1 = new ArrayList<>(freq1.values());
        List<Integer> values2 = new ArrayList<>(freq2.values());

        Collections.sort(values1);
        Collections.sort(values2);

        return values1.equals(values2);
    }

    private Map<Character, Integer> getFrequencyMap(String word) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : word.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }
}