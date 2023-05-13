package doublepointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(set::add);
        int max = 0;
        for (int num : nums) {
            int counter = 0;
            int right = num;
            int left = num;
            while (set.contains(right)) {
                set.remove(right++);
                counter++;
            }
            while (set.contains(--left)) {
                set.remove(left);
                counter++;
            }
            if (counter > max) {
                max = counter;
            }
        }
        return max;
    }
}
