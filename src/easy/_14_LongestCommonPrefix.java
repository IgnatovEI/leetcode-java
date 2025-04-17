package easy;

import java.util.Arrays;

public class _14_LongestCommonPrefix {
    /**
     * 14. Longest Common Prefix
     * @param strs array of strings
     * @return the longest common prefix string amongst an array of strings
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
        char[] firstWord = strs[0].toCharArray();
        char[] lastWord = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < firstWord.length; i++) {
            if (firstWord[i] == lastWord[i]) {
                res.append(firstWord[i]);
            }
        }

        return res.toString();
    }
}
