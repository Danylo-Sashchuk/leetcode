package arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        nums = new int[] {0,1,2,2,3,0,4,2};
        val = 2;
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int valid = 0;
        int all = nums.length - 1;
        while (valid <= all) {
            if (nums[valid] == val) {
                nums[valid] = nums[all];
                all--;
            } else {
                valid++;
            }
        }
        return valid;
    }
}
