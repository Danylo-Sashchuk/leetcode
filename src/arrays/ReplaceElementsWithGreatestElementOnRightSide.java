package arrays;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        int[] nums = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(nums)));
    }

    public static int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(temp, max);
        }
        return arr;
    }
}
