package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
//        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 3));
//        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    static public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                List<Integer> list = map.get(nums[i]);
                for (int j : list) {
                    if (Math.abs(j - i) <= k) return true;
                }
                list.add(i);
            } else {
                map.put(nums[i], new ArrayList<>(List.of(i)));
            }
        }
        return false;
    }
}
