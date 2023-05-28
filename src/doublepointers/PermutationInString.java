package doublepointers;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
        System.out.println(checkInclusion("ab", "a"));
    }

    static public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();


        //initial adding
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }


        for (int i = s1.length(); i < s2.length(); i++) {
            if (map1.equals(map2)) return true;
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);

            char tail = s2.charAt(i - s1.length());
            map2.put(tail, map2.getOrDefault(tail, 0) - 1);
            if (map2.get(tail) == 0) map2.remove(tail);
        }
        System.gc();
        return map1.equals(map2);
    }
}
