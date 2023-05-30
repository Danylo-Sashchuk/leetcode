package doublepointers;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC")); //"BANC"
    }

    static public String minWindow(String s, String t) {
        StringBuilder minWindow = new StringBuilder(s);
        Map<Character, Integer> map = new HashMap<>();
        int counter = t.length();
        for (char i : t.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0, j = 0; j < s.length(); ) {
            if (map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) > 0) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                counter--;
            }

            if (map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) < 0) {
                if (minWindow.length() > j - i) {
                    minWindow = new StringBuilder(s.substring(i, j));
                }
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                while (!map.containsKey(s.charAt(i))) {
                    i++;
                }
            }

            if (counter == 0) {
                i++;
            }
        }
        char[] res = s.toCharArray();
        int left = 0;
        int right = res.length - 1;
        String vowels = "aeiou";
        if (vowels.indexOf(res[left]) == -1) {

        }

        return minWindow.toString();
    }
}
