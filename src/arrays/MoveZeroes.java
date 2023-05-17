package arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 0, 2, 4};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes1(int[] nums) {
        int actual = 0;
        int pointer = 0;
        while (pointer < nums.length) {
            if (nums[pointer] != 0) {
                int temp = nums[actual];
                nums[actual] = nums[pointer];
                nums[pointer] = temp;
                actual++;
            }
            pointer++;
        }
    }

    public static void moveZeroes(int[] nums) {
        int actual = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[actual] = nums[i];
                actual++;
            }
        }
        Arrays.fill(nums, actual, nums.length, 0);
    }
}
