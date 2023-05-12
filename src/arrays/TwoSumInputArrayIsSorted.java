package arrays;

import java.util.Arrays;

public class TwoSumInputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 7, 11, 15};
        numbers = new int[]{-1, 0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int head = 0;
        int tail = numbers.length - 1;
        while (head <= tail) {
            int num = numbers[tail] + numbers[head];
            if (num > target) {
                tail--;
            } else if (num < target) {
                head++;
            } else {
                return new int[]{head + 1, tail + 1};
            }
        }
        return null;
    }

}
