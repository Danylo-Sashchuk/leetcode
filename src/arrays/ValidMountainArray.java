package arrays;

public class ValidMountainArray {
    public static void main(String[] args) {
        //        nums = new int[]{2, 1};
        //        nums = new int[]{3, 5, 5};
        int[] nums = {0, 3, 2, 1};
        System.out.println(validMountainArray(nums));
    }

    public static boolean validMountainArray(int[] arr) {
        int index = 0;
        while (index < arr.length - 1 && arr[index] < arr[index + 1])
            index++;
        if (index == 0 || index == arr.length - 1)
            return false;
        while (index < arr.length - 1 && arr[index] > arr[index + 1])
            index++;
        return index == arr.length - 1;
    }
}
