package arrays;

public class NumberOfStepsToReduceANumberToZero {
    public static int numberOfSteps(int num) {
        int counter = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;

            } else {
                num--;
            }
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(6));
        System.out.println(numberOfSteps(4));
    }
}
