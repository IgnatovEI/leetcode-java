package easy;

import java.util.ArrayList;
import java.util.List;

public class _345_ReverseVowelsOfAString {
    /**
     * 345. Reverse Vowels of a String
     * @param s string
     * @return reverse only all the vowels in the string and return it
     */
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
        char[] chars = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (vowels.contains(Character.toLowerCase(chars[l]))) {
                if (vowels.contains(Character.toLowerCase(chars[r]))) {
                    char tmp = chars[l];
                    chars[l] = chars[r];
                    chars[r] = tmp;
                    l++;
                }
                r--;
            } else {
                l++;
            }
        }

        return new String(chars);
    }
}
