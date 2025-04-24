package easy;

public class _541_ReverseStringII {
    /**
     * 541. Reverse String II
     * @param s string
     * @param k integer
     * @return reverse the first k characters for every 2k characters counting from the start of the string.
     * If there are fewer than k characters left, reverse all of them.
     * If there are less than 2k but greater than or equal to k characters,
     * then reverse the first k characters and leave the other as original
     */
    public String reverseStr(String s, int k) {
        if (s.length() <= 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        int p;
        char tmp;
        for (int i = 0; i < chars.length; i += 2 * k) {
            p = Math.min(i + k - 1, chars.length - 1);
            for (int j = i; j < i + k / 2 && j <= p; j++) {
                tmp = chars[j];
                chars[j] = chars[p];
                chars[p] = tmp;
                p--;
            }
        }

        return new String(chars);
    }
}
