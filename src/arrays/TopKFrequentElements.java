package arrays;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < nums.length + 1; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            buckets.get(frequency).add(key);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = nums.length; i > 0 && k > 0; i--) {
            if (!buckets.get(i).isEmpty()) {
                for (int j = 0; j < buckets.get(i).size() && k > 0; k--, j++) {
                    result.add(buckets.get(i).get(j));
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] topKFrequentStreamAPi(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list =
                map.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).map(Map.Entry::getKey).toList();
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
