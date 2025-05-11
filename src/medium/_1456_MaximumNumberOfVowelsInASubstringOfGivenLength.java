package medium;

import java.util.Set;

public class _1456_MaximumNumberOfVowelsInASubstringOfGivenLength {
    /**
     * 1456. Maximum Number of Vowels in a Substring of Given Length
     * @param s string
     * @param k integer
     * @return the maximum number of vowel letters in any substring of s with length k
     */
    public int maxVowels(String s, int k) {
        Set<Character> v = Set.of('a', 'e', 'i', 'o', 'u');
        int max, curr = 0;

        for (int i = 0; i < k; i++) {
            if (v.contains(s.charAt(i))) {
                curr++;
            }
        }

        max = curr;

        for (int i = k; i < s.length(); i++) {
            char out = s.charAt(i - k);
            if (v.contains(out)) {
                curr--;
            }
            char in = s.charAt(i);
            if (v.contains(in)) {
                curr++;
            }
            max = Math.max(max, curr);
        }

        return max;
    }
}
