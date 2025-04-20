package easy;

public class _344_ReverseString {
    /**
     * 344. Reverse String
     * @param s string
     */
    public void reverseString(char[] s) {
        int j = s.length - 1;
        char tmp;

        for (int i = 0; i < s.length / 2; i++) {
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            j--;
        }
    }
}
