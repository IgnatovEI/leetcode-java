package easy;

public class _1768_MergeStringsAlternately {
    /**
     * 1768. Merge Strings Alternately
     * @param word1 string
     * @param word2 string
     * @return the merged string
     */
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int p1 = 0;
        int p2 = 0;
        while (p1 != word1.length() || p2 != word2.length()) {
            if (p1 != word1.length()) {
                sb.append(word1.charAt(p1));
                p1++;
            }
            if (p2 != word2.length()) {
                sb.append(word2.charAt(p2));
                p2++;
            }
        }
        return sb.toString();
    }
}
