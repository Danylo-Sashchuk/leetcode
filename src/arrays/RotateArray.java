package arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int steps = 7;
//        nums = new int[]{-1, 2};
         steps = 3;
        rotate(nums, steps);
        System.out.println(Arrays.toString(nums));
    }

    static public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        while (k > nums.length) k -= nums.length;
        System.arraycopy(nums, k, res, 0, nums.length - k);
        System.arraycopy(nums, 0, res, nums.length - k, k);

        System.arraycopy(res, 0, nums, 0, nums.length);
    }
}
