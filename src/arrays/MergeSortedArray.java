package arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        print(merge(new int [] {1,2,3,0,0,0}, 3, new int [] {2,5,6}, 3));
        print(merge(new int [] {1}, 1, new int [] {}, 0));
        print(merge(new int [] {0}, 0, new int [] {1}, 1));
    }

    public static void print(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();;
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[n + m];
        int firstPointer = 0;
        int secondPointer = 0;
        int resPointer = 0;
        while (firstPointer < m || secondPointer < n) {
            if (firstPointer == m) {
                res[resPointer++] = nums2[secondPointer++];
                continue;
            }
            if (secondPointer == n) {
                res[resPointer++] = nums1[firstPointer++];
                continue;
            }
            if (nums1[firstPointer] <= nums2[secondPointer]) {
                res[resPointer++] = nums1[firstPointer++];
            } else {
                res[resPointer++] = nums2[secondPointer++];
            }
        }
        return res;
    }
}
