package medium;

import java.util.ArrayList;
import java.util.List;

/*
    271. Encode and Decode Strings
*/
public class _271_EncodeAndDecodeStrings {
    /**
     *
     * @param strs list of strings
     * @return encoded string
     */
    public static String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str).append('|');
        }
        return encoded.toString();
    }

    /**
     *
     * @param str string
     * @return decoded list of strings
     */
    public static List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != '|') {
                sb.append(c);
            } else {
                decoded.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        return decoded;
    }
}
