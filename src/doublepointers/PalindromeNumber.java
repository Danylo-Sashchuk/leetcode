package doublepointers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int temp = x;
        int rev = 0;
        while (temp != 0) {
            rev *= 10;
            int num = temp % 10;
            rev += num;
            temp /= 10;
        }
        return rev == x;
    }
}
