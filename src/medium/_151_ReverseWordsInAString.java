package medium;

public class _151_ReverseWordsInAString {
    /**
     * 151. Reverse Words in a String
     * @param s string
     * @return reverse the order of the words
     */
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    String tmp = reverseWord(sb.toString());
                    res.append(tmp).append(" ");
                    sb = new StringBuilder();
                }
            }
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }

    private String reverseWord(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            char tmp = chars[l];
            chars[l] = chars[r];
            chars[r] = tmp;
            l++;
            r--;
        }
        return new String(chars);
    }
}
