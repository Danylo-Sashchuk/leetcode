package arrays;

public class RemoveDuplicatesFromASortedArray {
    //0 0 1 1 1 2 2 3 3 4
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                nums[++count] = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        num = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(num));
    }
}
