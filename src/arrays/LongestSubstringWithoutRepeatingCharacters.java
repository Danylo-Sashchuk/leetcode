package arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int right = 0;
        int left = 0;
        int max = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            char l = s.charAt(left);
            if (!set.contains(r)) {
                set.add(r);
                right++;
            } else {
                set.remove(l);
                left++;
            }
            max = Integer.max(max, set.size());
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        //s = "bbbbb";
        //s = "pwwkew";
       // s = "";
        //s = " ";
        //s = "au";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
