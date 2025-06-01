package easy;

public class _367_ValidPerfectSquare {
    /**
     * 367. Valid Perfect Square
     * @param num integer
     * @return true if num is a perfect square or false otherwise
     */
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        if (num == 1) return true;

        long l = 1;
        long r = num / 2;

        while (l <= r) {
            long m = l + (r - l) / 2;
            long square = m * m;

            if (square == num) {
                return true;
            } else if (square < num) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return false;
    }
}
