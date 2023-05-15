package hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] s = {"Hello","Alaska","Dad","Peace"};
        s = new String[]{"a","b"};
        System.out.println(Arrays.toString(findWords1(s)));
    }

    public static String[] findWords1(String[] words) {
        HashSet<Character> first = new HashSet<>();
        HashSet<Character> second = new HashSet<>();
        HashSet<Character> third = new HashSet<>();
        String q = "qwertyuiop";
        String a = "asdfghjkl";
        String z = "zxcvbnm";
        q.chars().forEach(c -> first.add((char) c));
        a.chars().forEach(c -> second.add((char) c));
        z.chars().forEach(c -> third.add((char) c));
        List<String> res = new ArrayList<>();
        main:
        for (int i = 0; i < words.length; i++) {
            boolean inFirst = false;
            boolean inSecond = false;
            boolean inThird = false;
            for (int j = 0; j < words[i].length(); j++) {
                if (first.contains(Character.toLowerCase(words[i].charAt(j)))) {
                    if (inSecond || inThird) continue main;
                    inFirst = true;
                }
                if(second.contains(Character.toLowerCase(words[i].charAt(j)))) {
                    if (inFirst || inThird) continue main;
                    inSecond = true;
                }
                if(third.contains(Character.toLowerCase(words[i].charAt(j)))) {
                    if (inFirst || inSecond) continue main;
                    inThird = true;
                }
            }
            res.add(words[i]);
        }
        return res.toArray(new String[0]);
    }

}
