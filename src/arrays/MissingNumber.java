package arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.println(missingNumber(new int[]{0, 1}));
    }

    static public int missingNumber1(int[] nums) {
        boolean[] checked = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            checked[nums[i]] = true;
        }
        for (int i = 0; i < nums.length + 1; i++) {
            if (!checked[i]) {
                return i;
            }
        }
        return -1;
    }

    static public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += i;
            sum -= nums[i];
        }
        sum += nums.length;
        return sum;
    }
}
