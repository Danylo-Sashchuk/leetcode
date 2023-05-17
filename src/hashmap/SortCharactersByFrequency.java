package hashmap;

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort1(String s) { // n - number of unique chars
        StringBuilder res = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> allChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            allChars.add(c);
        }
        for (int i = 0; i < allChars.size(); ) {
            int max = 0;
            char printable = ' ';
            for (Character c : allChars) {
                if (map.get(c) > max) {
                    printable = c;
                    max = map.get(c);
                }
            }
            res.append(String.valueOf(printable).repeat(max));
            allChars.remove(printable);
        }
        return res.toString();
    }

    public static String frequencySort(String s) {
        StringBuilder res = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        Queue<Map.Entry<Character, Integer>> queue =
                new PriorityQueue<>((n, m) -> m.getValue().compareTo(n.getValue()));
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        queue.addAll(map.entrySet());
        while (!queue.isEmpty()) {
            Map.Entry<Character, Integer> entry = queue.poll();
            res.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return res.toString();
    }
}
