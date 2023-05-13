package doublepointers;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        int temp = x;
        int rev = 0;
        int save = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            if((rev - temp % 10) / 10 != save){
                return 0;
            }
            save = rev;
            temp /= 10;
        }
        return rev;
    }
}
