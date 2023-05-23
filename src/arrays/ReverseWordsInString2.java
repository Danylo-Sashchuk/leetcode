package arrays;

import java.util.function.Predicate;

public class ReverseWordsInString2 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    static public String reverseWords(String s) {
        char[] input = s.toCharArray();
        int right = 0;
        int left = 0;
        while (left < input.length) {
            left = findEndWord(left, input, c -> c == ' ');
            if (left == input.length - 1) return String.valueOf(input);
            right = findEndWord(left, input, c -> c != ' ');
            right--;
            reverseWord(left, right, input);
            left = ++right;
        }
        return String.valueOf(input);
    }

    private static void reverseWord(int left, int right, char[] input) {
        while (left < right) {
            char t = input[right];
            input[right--] = input[left];
            input[left++] = t;
        }
    }

    private static int findEndWord(int left, char[] input, Predicate<Character> predicate) {
        while (left < input.length && predicate.test(input[left])) {
            left++;
        }
        return left;
    }
}
