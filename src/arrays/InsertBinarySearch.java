package arrays;

public class InsertBinarySearch {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int index = left + (right - left) / 2;
            if (nums[index] == target) return index;
            else if (nums[index] > target) right = index;
            else left = index + 1;
        }
        return left;
    }
}
