package doublepointers;

import java.util.*;

public class SumOfThree {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        lists.forEach(System.out::println);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> integers = new ArrayList<>();
                    integers.add(nums[i]);
                    integers.add(nums[j]);
                    integers.add(nums[k]);
                    set.add(integers);
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
