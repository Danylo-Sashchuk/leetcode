package arrays;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String s1 = "mississippi";
        String s2 = "issi";
        System.out.println(strStr(s1, s2));
    }

    static public int strStr(String haystack, String needle) {
        int left = 0;

        boolean isValid = true;
        while (left <= haystack.length() - needle.length()) {
            for (int i = left, j = 0; j < needle.length(); j++, i++) {
                if (haystack.charAt(i) != needle.charAt(j)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid)
                return left;
            isValid = true;
            left++;
        }

        return -1;
    }
}
