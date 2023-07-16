package arrays;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {

    }

    public static int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted);
        int res = 0;
        for (int i = 0; i < heights.length; i++)
            if (heights[i] != sorted[i])
                res++;
        return res;
    }
}
