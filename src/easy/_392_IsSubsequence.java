package easy;

public class _392_IsSubsequence {
    /**
     * 392. Is Subsequence
     * @param s string
     * @param t string
     * @return true if s is a subsequence of t, or false otherwise
     */
    public boolean isSubsequence(String s, String t) {
        if (s.isBlank()) {
            return false;
        }

        int p = 0;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(p) == t.charAt(i)) {
                p++;
            }
            if (p == s.length()) {
                return true;
            }
        }

        return false;
    }
}
