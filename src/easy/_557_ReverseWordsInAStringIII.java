package easy;

public class _557_ReverseWordsInAStringIII {
    /**
     * 557. Reverse Words in a String III
     * @param s string
     * @return reverse the order of characters in each word within a sentence
     * while still preserving whitespace and initial word order
     */
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int p = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                for (int j = i - 1; j > p; j--) {
                    char tmp = chars[p];
                    chars[p] = chars[j];
                    chars[j] = tmp;
                    p++;
                }
                p = i + 1;
            }
            if (i == chars.length - 1) {
                for (int j = i; j > p; j--) {
                    char tmp = chars[p];
                    chars[p] = chars[j];
                    chars[j] = tmp;
                    p++;
                }
            }
        }

        return new String(chars);
    }
}
