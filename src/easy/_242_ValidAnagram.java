package easy;

import java.util.Arrays;

public class _242_ValidAnagram {
    /**
     * 242. Valid Anagram
     * @param s string
     * @param t string
     * @return true if t is an anagram of s
     */
    public boolean isAnagram(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        String a = new String(str1);
        String b = new String(str2);

        return a.equals(b);
    }
}
