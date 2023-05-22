package arrays;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }

    static public int minSubArrayLen(int target, int[] nums) {
        int continuesLength = 0;
        int max = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            max += nums[i];
            while (max >= target) {
                if (continuesLength == 0 || continuesLength > i - left + 1) {
                    continuesLength = i - left + 1;
                }
                max -= nums[left++];
            }
        }
        return continuesLength;
    }
}
