package easy;

public class _28_FindTheIndexOfTheFirstOccurrenceInAString {
    /**
     * 28. Find the Index of the First Occurrence in a String
     * @param haystack string
     * @param needle substring
     * @return first occurrence of needle in haystack
     */
    public int strStr(String haystack, String needle) {
        int p = 0;
        int count = 0;

        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if(p < haystack.length()
                        && haystack.charAt(p) == needle.charAt(j)) {
                    p++;
                    count++;
                    if (count == needle.length()) {
                        return i;
                    }
                } else {
                    count = 0;
                    p = i + 1;
                    break;
                }
            }

        }

        return -1;
    }
}
