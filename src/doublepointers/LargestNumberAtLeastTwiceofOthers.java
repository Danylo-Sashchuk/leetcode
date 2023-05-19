package doublepointers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        nums = new int[]{1, 2, 3, 4};
        nums = new int[]{0, 0, 0, 2};
        nums = new int[]{1, 0};
//        nums = new int[]{0, 0, 3, 2};
//        nums = new int[]{1, 2, 16, 35, 44, 100, 27, 0};
        nums = new int[]{3, 6, 1, 0};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex1(int[] nums) {
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

    public static int dominantIndex(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparing(i -> nums[i]));
        for (int i = 0; i < nums.length; i++) {
            queue.add(i);
            if (queue.size() == 3) queue.poll();
        }
        int second = queue.poll();
        int first = queue.poll();
        if (nums[second] + nums[second] <= nums[first]) return first;
        return -1;
    }

}
