package doublepointers;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        //        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("aA"));
    }

    static public String reverseVowels(String s) {
        char[] res = s.toCharArray();
        int left = 0;
        int right = res.length - 1;
        String vowels = "aeiouAEIOU";
        while (left < right) {
            while (vowels.indexOf(res[left]) == -1 && left < right) {
                left++;
            }
            while (vowels.indexOf(res[right]) == -1 && left < right) {
                right--;
            }
            char t = res[left];
            res[left] = res[right];
            res[right] = t;
            left++;
            right--;
        }
        return String.valueOf(res);
    }
}
