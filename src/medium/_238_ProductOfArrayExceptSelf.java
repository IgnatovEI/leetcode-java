package medium;

public class _238_ProductOfArrayExceptSelf {
    /**
     * 238. Product of Array Except Self
     * @param nums integer array
     * @return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]
     */
    public int[] productExceptSelf(int[] nums) {
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];

        l[0] = 1;
        r[r.length - 1] = 1;

        for (int i = 1; i < l.length; i++) {
            l[i] = l[i - 1] * nums[i - 1];
        }

        for (int i = r.length - 2; i > -1; i--) {
            r[i] = r[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = l[i] * r[i];
        }

        return nums;
    }
}
