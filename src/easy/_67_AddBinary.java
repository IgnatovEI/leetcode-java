package easy;

public class _67_AddBinary {
    /**
     * 67. Add Binary
     * @param a string
     * @param b string
     * @return their sum as a binary string
     */
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int carry = 0;

        while (lenA >= 0 || lenB >= 0) {
            int sum = carry;

            if (lenA >= 0) {
                sum += a.charAt(lenA) - '0';
                lenA--;
            }

            if (lenB >= 0) {
                sum += b.charAt(lenB) - '0';
                lenB--;
            }

            ans.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            ans.append(carry);
        }

        return ans.reverse().toString();
    }
}
