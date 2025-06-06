package easy;

public class _509_FibonacciNumber {
    /**
     * 509. Fibonacci Number
     * @param n integer
     * @return  F(n)
     */
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, ans = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + ans;
            a = ans;
            ans = c;
        }
        return ans;
    }
}
