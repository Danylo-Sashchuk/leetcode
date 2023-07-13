package arrays;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void duplicateZeros1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr.length - 1;
                while (temp > i) {
                    arr[temp] = arr[temp - 1];
                    temp--;
                }
                i++;
            }
        }
    }

    public static void duplicateZeros(int[] arr) {
        int zeroes = (int) Arrays.stream(arr).filter(n -> n == 0).count();
        int newPlace = arr.length + zeroes - 1;
        int oldPlace = arr.length - 1;
        while (oldPlace < newPlace) {
            if (arr[oldPlace] != 0) {
                if (newPlace < arr.length)
                    arr[newPlace] = arr[oldPlace];
            } else {
                if (newPlace < arr.length)
                    arr[newPlace] = arr[oldPlace];
                newPlace--;
                if (newPlace < arr.length)
                    arr[newPlace] = arr[oldPlace];
            }
            oldPlace--;
            newPlace--;
        }
    }
}
