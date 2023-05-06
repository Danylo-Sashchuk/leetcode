package hashset;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> out = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            if (out.containsKey(number)) {
                return new int[]{out.get(number), i};
            } else {
                out.put(nums[i], i);
            }
        }
        return new int[]{0, 0};
    }
}
