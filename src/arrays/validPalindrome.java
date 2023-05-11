package arrays;

public class validPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        char[] array = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (char c : array) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                res.append(Character.toLowerCase(c));
            }
        }
        for (int i = 0, j = res.length() - 1; i < res.length(); i++, j--) {
            if (res.charAt(i) != res.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
