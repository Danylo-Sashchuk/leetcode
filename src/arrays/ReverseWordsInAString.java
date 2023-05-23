package arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    static public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            reverse(chars, i, j);
        }

        //find word
        for (int i = 0; i < chars.length; i++) {
            while (i < chars.length && chars[i] == ' ') i++; //skip spaces
            int wordStart = i;
            while (i < chars.length && chars[i] != ' ') i++; //find word and
            int wordEnd = --i;
            while (wordStart < wordEnd) reverse(chars, wordStart++, wordEnd--);
        }
        return String.valueOf(chars).trim();
    }

    static private void reverse(char[] chars, int a, int b) {
        char t = chars[b];
        chars[b] = chars[a];
        chars[a] = t;
    }
}
