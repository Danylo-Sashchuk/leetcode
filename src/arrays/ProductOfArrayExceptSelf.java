package arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int product = 1;
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            product *= nums[i - 1];
            left[i] = product;
        }
        product = 1;
        right[nums.length-1] = 1;
        for (int i = nums.length - 2; i >= 0; i--){
            product *= nums[i + 1];
            right[i] = product;
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        for (int i = 0; i < nums.length; i++) {
            answer[i] = left[i] * right[i];
        }
        return answer;
    }
}
