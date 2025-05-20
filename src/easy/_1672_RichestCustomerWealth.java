package easy;

public class _1672_RichestCustomerWealth {
    /**
     * 1672. Richest Customer Wealth
     * @param accounts m x n integer grid
     * where accounts[i][j] is the amount of money the ith customer has in the jth bank
     * @return the wealth that the richest customer has
     */
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;

        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
