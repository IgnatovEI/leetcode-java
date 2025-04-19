package easy;

public class _58_LengthOfLastWord {
    /**
     * 58. Length of Last Word
     * @param s string with words and spaces
     * @return the length of the last word in the string
     */
    public int lengthOfLastWord(String s) {
        if (s.isBlank()) {
            return 0;
        }

        int c = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                c++;
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    break;
                }
            }
        }
        return c;
    }
}
