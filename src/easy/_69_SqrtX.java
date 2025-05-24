package easy;

public class _69_SqrtX {
    /**
     * 69. Sqrt(x)
     * @param x non-negative integer
     * @return the square root of x rounded down to the nearest integer
     */
    public int mySqrt(int x) {
        int l = 0, r = x;
        int ans = 0;

        while (l <= r) {
            int m = l + ((r - l) / 2);
            long square = (long) m * m;

            if (square > x) r = m - 1;
            else if (square < x) {
                l = m + 1;
                ans = m;
            } else return m;
        }

        return ans;
    }
}
