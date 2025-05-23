package medium;

public class _7_ReverseInteger {
    /**
     * 7. Reverse Integer
     * @param x signed 32-bit integer
     * @return x with its digits reversed.
     * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
     * then return 0
     */
    public int reverse(int x) {
        int res = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            res = res * 10 + digit;
        }

        return res;
    }
}
