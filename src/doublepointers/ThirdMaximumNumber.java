package doublepointers;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 5, 3, 5};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = first;
        long third = first;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] > second && nums[i] != first) {
                third = second;
                second = nums[i];
            } else if (nums[i] > third && nums[i] != second && nums[i] != first) {
                third = nums[i];
            }
        }
        if (third == Long.MIN_VALUE)
            return (int) first;
        return (int) third;
    }
}
