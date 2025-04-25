package easy;

public class _557_ReverseWordsInAStringIII {
    /**
     * 557. Reverse Words in a String III
     * @param s string
     * @return reverse the order of characters in each word within a sentence
     * while still preserving whitespace and initial word order
     */
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            } else {
                res.append(reverseWord(word.toString()));
                word = new StringBuilder();
            }
        }

        res.append(reverseWord(word.toString()));

        res.deleteCharAt(res.length() - 1);

        return res.toString();
    }

    private String reverseWord(String s) {
        char[] chars = s.toCharArray();
        int p = chars.length - 1;
        for (int i = 0; i < chars.length / 2; i++) {
            char tmp = chars[i];
            chars[i] = chars[p];
            chars[p] = tmp;
            p--;
        }
        return String.valueOf(chars) + ' ';
    }
}
