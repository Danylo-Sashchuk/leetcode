package hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "bbbaaaba";
        String t = "aaabbbba";
        System.out.println(isIsomorphic(s, t));
    }

    static public boolean isIsomorphic(String s, String t) {
            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                int indx1 = map1.getOrDefault(s.charAt(i), -1);
                int indx2 = map1.getOrDefault(t.charAt(i), -1);
                if (indx1 != indx2) {
                    return false;
                }
                map1.put(s.charAt(i), i);
                map2.put(t.charAt(i), i);
            }
            return true;
    }
}
