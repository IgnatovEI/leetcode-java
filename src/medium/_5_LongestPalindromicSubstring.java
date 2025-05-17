package medium;

public class _5_LongestPalindromicSubstring {
    /**
     * 5. Longest Palindromic Substring
     * @param s string
     * @return the longest palindromic substring in s
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        String LPS = s.substring(0, 1);

        for (int i = 1; i < s.length(); i++) {
            String oddPal = findPal(s, i, i);
            if (oddPal.length() > LPS.length()) {
                LPS = oddPal;
            }

            String evenPal = findPal(s, i - 1, i);
            if (evenPal.length() > LPS.length()) {
                LPS = evenPal;
            }
        }

        return LPS;
    }

    private String findPal(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
