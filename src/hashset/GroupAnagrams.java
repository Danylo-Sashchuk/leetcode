package hashset;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] alphabet = new int[26];
            for (char c : s.toCharArray())
                alphabet[c - 'a']++;
            int key = Arrays.hashCode(alphabet);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //input = new String[]{"", ""};
        List<List<String>> output = new ArrayList<>();
        output.add(new ArrayList<>());
        output.add(new ArrayList<>());
        output.add(new ArrayList<>());
        output.get(0).add("bat");
        output.get(1).add("nat");
        output.get(1).add("tan");
        output.get(2).add("ate");
        output.get(2).add("eat");
        output.get(2).add("tea");
        System.out.println(groupAnagrams(input));
        System.out.println(output);
    }
}
