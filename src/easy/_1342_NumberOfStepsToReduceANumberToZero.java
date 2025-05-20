package easy;

public class _1342_NumberOfStepsToReduceANumberToZero {
    /**
     * 1342. Number of Steps to Reduce a Number to Zero
     * @param num integer
     * @return the number of steps to reduce it to zero
     */
    public int numberOfSteps(int num) {
        int cnt = 0;

        while (num != 0) {
            if (num % 2 == 0) num /= 2;
            else num--;
            cnt++;
        }

        return cnt;
    }
}
