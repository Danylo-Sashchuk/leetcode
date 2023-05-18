package doublepointers;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        nums = new int[]{1, 2, 3, 4};
        nums = new int[]{0, 0, 0, 2};
        nums = new int[]{1, 0};
        nums = new int[]{0, 0, 3, 2};
        nums = new int[]{1, 2, 16, 35, 44, 100, 27, 0};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int index = -1;
        int max = Integer.MIN_VALUE;
        int second = max;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }
        if (second == 0 && max != 0) return index;
        if (second + second <= max) return index;
        return -1;
    }
}
