package easy;

import java.util.ArrayList;
import java.util.List;

public class _1431_KidsWithTheGreatestNumberOfCandies {
    /**
     * 1431. Kids With the Greatest Number of Candies
     * @param candies integer array where each candies[i] represents the number of candies the ith kid has
     * @param extraCandies integer denoting the number of extra candies that you have
     * @return a boolean array result of length n, where result[i] is true if,
     * after giving the ith kid all the extraCandies,
     * they will have the greatest number of candies among all the kids, or false otherwise
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        List<Boolean> ls = new ArrayList<>();
        for (int candy : candies) {
            ls.add(candy + extraCandies >= max);
        }

        return ls;
    }
}
