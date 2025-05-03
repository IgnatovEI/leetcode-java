package easy;

public class _1732_FindTheHighestAltitude {
    /**
     * 1732. Find the Highest Altitude
     * @param gain integer array
     * @return the highest altitude of a point
     */
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int res = alt;

        for (int i : gain) {
            alt += i;
            if (alt > res) {
                res = alt;
            }
        }

        return res;
    }
}
