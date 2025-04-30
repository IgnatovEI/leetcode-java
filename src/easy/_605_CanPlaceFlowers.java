package easy;

public class _605_CanPlaceFlowers {
    /**
     * 605. Can Place Flowers
     * @param flowerbed integer array containing 0's and 1's, where 0 means empty and 1 means not empty
     * @param n integer
     * @return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule
     * and false otherwise
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                n--;
                if (n == 0) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
