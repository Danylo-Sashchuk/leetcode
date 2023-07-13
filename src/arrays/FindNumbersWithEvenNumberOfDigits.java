package arrays;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                counter++;
            }
            if (counter % 2 == 0)
                res++;
        }
        return res;
    }
}
