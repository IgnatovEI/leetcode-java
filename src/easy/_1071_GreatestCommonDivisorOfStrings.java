package easy;

public class _1071_GreatestCommonDivisorOfStrings {
    /**
     * 1071. Greatest Common Divisor of Strings
     * @param str1 string
     * @param str2 string
     * @return the largest string x such that x divides both str1 and str2
     */
    public String gcdOfStrings(String str1, String str2) {
        if(str2.length() > str1.length()) {
            return gcdOfStrings(str2, str1);
        }
        if(str2.equals(str1)) {
            return str1;
        }
        if(str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        return "";
    }
}
