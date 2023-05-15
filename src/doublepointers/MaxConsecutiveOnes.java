package doublepointers;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tempMax = 0;
        for (int i : nums) {
            if (i == 1) {
                tempMax++;
            } else {
                max = Math.max(tempMax, max);
                tempMax = 0;
            }
        }
        return Math.max(max, tempMax);
    }
}
