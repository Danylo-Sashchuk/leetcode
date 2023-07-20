package hashmap;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));
        System.out.println(characterReplacement("AABABBA", 1));
        System.out.println(characterReplacement("AAAA", 0));
        System.out.println(characterReplacement("AABA", 0));
        System.out.println(characterReplacement("ABCDE", 1));

        //AABABBA
        // .   .

    }

    static public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;

        int left = 0;
        int right = k;
        int tempK = k;
        for (int i = 0; i < right; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        while (right < s.length() && left < s.length()) {
            char common = findTheMostCommonChar(map, s);
            if (s.charAt(right) != common) {
                map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
                tempK--;
            } else {
                map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            }

            if (tempK == -1) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                if (map.get(s.charAt(left)) == 0)
                    map.remove(s.charAt(left));
                tempK++;
                left++;
                right++;
            }
            res = Math.max(res, right - left);
        }

        return res;
    }

    static private char findTheMostCommonChar(Map<Character, Integer> map, String s) {
        int max = -1;
        char common = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                common = entry.getKey();
                max = entry.getValue();
            }
        }
        if (map.size() == 0)
            common = s.charAt(0);
        return common;
    }
}
