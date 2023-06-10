package arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target)); // 4
    }

    static public int search(int[] nums, int target) {
        int lower = 0;
        int higher = nums.length - 1;
        while (lower <= higher) {
            int index = (lower + higher) / 2;
            if (nums[index] == target)
                return index;
            if (nums[index] < target) {
                lower = index + 1;
            } else {
                higher = index - 1;
            }
        }
        return -1;
    }
}
