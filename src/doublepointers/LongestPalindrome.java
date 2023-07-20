package doublepointers;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        //        s = "cbbd";
        //        s = "a";
        //        s = "bb";
        //        s = "abb";
        System.out.println(longestPalindrome1(s));
    }

    public static String longestPalindrome(String s) {
        if (s == null)
            return null;
        if (s.length() == 0)
            return "";
        if (s.length() == 1)
            return s;
        StringBuilder res = new StringBuilder();
        int left = 0;
        int right = s.length();
        while (left <= right) {
            StringBuilder sub = new StringBuilder(s.substring(left, right));
            if (isPalindrome(sub.toString())) {
                if (res.length() < sub.length()) {
                    res = sub;
                }
                left++;
                right = s.length();
            } else
                right--;
        }
        return res.toString();
    }

    private static boolean isPalindrome(String s) {
        int right = 0;
        int left = s.length() - 1;
        while (right <= left) {
            if (s.charAt(right++) != s.charAt(left--)) {
                return false;
            }
        }
        return true;
    }

    public static String longestPalindrome1(String s) {
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int len = 0; i + len < s.length(); len++) {
                if (isPalindrome(s.substring(i, len)) && len + 1 > maxLen) {
                    maxLen = len + 1;
                    start = i;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}
