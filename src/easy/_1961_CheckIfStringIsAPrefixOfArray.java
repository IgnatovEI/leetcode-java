package easy;

public class _1961_CheckIfStringIsAPrefixOfArray {
    /**
     * 1961. Check If String Is a Prefix of Array
     * @param s string
     * @param words array of strings
     * @return true if s is a prefix string of words, or false otherwise
     */
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();

        for (String str : words) {
            sb.append(str);
            if (sb.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }
}
