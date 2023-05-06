package hashmap;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("aacc", "ccac"));
    }

    public static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> letters = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (letters.containsKey(c)) {
                letters.put(c, letters.get(c) + 1);
            } else {
                letters.put(c, 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (letters.containsKey(c) && letters.get(c) != 0) {
                letters.put(c, letters.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (char c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            alphabet[c - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
