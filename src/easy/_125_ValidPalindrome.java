package easy;

public class _125_ValidPalindrome {
    /**
     * 125. Valid Palindrome
     * @param s string
     * @return true if it is a palindrome
     */
    public boolean validPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (isAlphanumeric(chars[l])) {
                l++;
                continue;
            }
            if (isAlphanumeric(chars[r])) {
                r--;
                continue;
            }
            if (chars[l] != chars[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        return (c < 'a' || c > 'z') && (c < '0' || c > '9');
    }
}
