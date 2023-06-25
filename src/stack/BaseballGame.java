package stack;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5", "2", "C", "D", "+"}));
        System.out.println(calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
        System.out.println(calPoints(new String[]{"1", "C"}));

    }

    static public int calPoints(String[] operations) {
        Stack<String> record = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+" -> {
                    int a = Integer.parseInt(record.pop());
                    int b = Integer.parseInt(record.pop());
                    int c = a + b;
                    record.push(String.valueOf(b));
                    record.push(String.valueOf(a));
                    record.push(String.valueOf(c));
                }
                case "D" -> {
                    int a = Integer.parseInt(record.peek());
                    int b = a * 2;
                    record.push(String.valueOf(b));
                }
                case "C" -> record.pop();
                default -> record.push(operations[i]);
            }
        }
        return record.stream().map(Integer::parseInt).reduce(0, Integer::sum);
    }
}
