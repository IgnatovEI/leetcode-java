package easy;

public class _66_PlusOne {
    /**
     * 66. Plus One
     * @param digits large integer represented as an integer array
     * @return Increment the large integer by one and return the resulting array of digits
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9 && i == 0) {
                int[] res = new int[digits.length + 1];
                res[0] = 1;
                return res;
            }
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                break;
            }
        }

        return digits;
    }
}
