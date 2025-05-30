package easy;

public class _70_ClimbingStairs {
    /**
     * 70. Climbing Stairs
     * @param n steps to reach the top
     * @return Each time you can either climb 1 or 2 steps
     * In how many distinct ways can you climb to the top?
     */
    public int climbStairs(int n) {
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
