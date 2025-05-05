package medium;

public class _443_StringCompression {
    /**
     * 443. String Compression
     * @param chars array of characters
     * @return compress it using the following algorithm:
     * Begin with an empty string s. For each group of consecutive repeating characters in chars:
     * If the group's length is 1, append the character to s.
     * Otherwise, append the character followed by the group's length.
     * The compressed string s should not be returned separately,
     * but instead, be stored in the input character array chars.
     * Note that group lengths that are 10 or longer will be split into multiple characters in chars.
     * After you are done modifying the input array, return the new length of the array
     */
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();

        int p1 = 0, p2 = 0, cnt = 0;

        while (p1 < chars.length) {
            if (chars[p1] != chars[p2]) {
                if (cnt == 1) {
                    sb.append(chars[p2]);
                } else {
                    sb.append(chars[p2]).append(cnt);
                }
                p2 = p1;
                cnt = 0;
            }
            if (p1 == chars.length - 1) {
                cnt++;
                if (cnt == 1) {
                    sb.append(chars[p2]);
                } else {
                    sb.append(chars[p2]).append(cnt);
                }
            }
            p1++;
            cnt++;
        }

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}
