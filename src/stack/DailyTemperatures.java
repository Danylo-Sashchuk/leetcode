package stack;

import java.util.Arrays;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        for (int i = 0; i < temperatures.length; i++) {

        }
        return temperatures;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        // temperatures = new int[]{30, 40, 50, 60};
        //temperatures = new int[]{30, 60, 90};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
