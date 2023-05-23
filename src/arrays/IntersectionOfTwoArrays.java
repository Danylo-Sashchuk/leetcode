package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    static public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res1 = new HashSet<>();
        Set<Integer> res2 = new HashSet<>();
        Set<Integer> res3 = new HashSet<>();
        Arrays.stream(nums1).forEach(res1::add);
        Arrays.stream(nums2).forEach(res2::add);
        res1.retainAll(res2);
        res2.forEach(n -> {
            if (res1.contains(n)) {
                res3.add(n);
            }
        });
        int[] r = new int[res3.size()];
        int a = 0;
        for (Integer in : res3) {
            r[a++] = in;
        }
        return r;
    }
}
