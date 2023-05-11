package arrays;

public class validPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("a.,.,.,.',a"));
    }

    public static boolean isPalindrome(String s) {
        char[] array = s.toCharArray();
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            while (!Character.isLetterOrDigit(array[first]) && first<array.length - 1) first++;
            while (!Character.isLetterOrDigit(array[last]) && last>0) last--;
            if (first > last) return true;
            if (Character.toLowerCase(array[first]) != Character.toLowerCase(array[last])) return false;
            first++;
            last--;
        }
        return true;
    }
}
