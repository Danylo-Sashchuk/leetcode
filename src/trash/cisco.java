package trash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cisco {
    public static void main(String[] args) {
        String[] word = new String[]{"HUT", "CAT", "SUN"};
        char[][] grid = {
                {'A', 'B', 'C'},
                {'T', 'A', 'C'},
                {'N', 'U', 'S'},
                {'T', 'U', 'H'}
        };
        List<String> words = new ArrayList<>();
        for (String s : word) {
            words.add(s);
        }
        Map<String, Boolean> answers = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                for (String s : words) {
                    if (grid[i][j] == s.charAt(0)) {
                        if (right_search(grid, i, j, s) ||
                            left_search(grid, i, j, s) ||
                            down_search(grid, i, j, s) ||
                            upper_search(grid, i, j, s)) {
                            answers.put(s, true);
                        }
                    }
                }
                for (String s : answers.keySet()) {
                    words.remove(s);
                }
            }
        }
        System.out.println(answers);
        for (String s : word) {
            if (answers.containsKey(s) && answers.get(s)) {
                System.out.print("Yes ");
            } else {
                System.out.print("No ");
            }
        }
    }

    public static boolean right_search(char[][] grid, int i, int j, String word) {
        j++;
        for (int w = 1; j < grid[0].length; j++, w++) {
            if (grid[i][j] != word.charAt(w)) {
                return false;
            } else if (w + 1 == word.length()) {
                return true;
            }
        }
        return false;
    }

    public static boolean left_search(char[][] grid, int i, int j, String word) {
        return upper_and_left_search(j, i, word, grid[i], grid);
    }

    public static boolean down_search(char[][] grid, int i, int j, String word) {
        i++;
        for (int w = 1; i < grid.length; i++, w++) {
            if (grid[i][j] != word.charAt(w)) {
                return false;
            } else if (w + 1 == word.length()) {
                return true;
            }
        }
        return false;
    }

    public static boolean upper_search(char[][] grid, int i, int j, String word) {
        return upper_and_left_search(i, j, word, grid[i], grid);
    }

    public static boolean upper_and_left_search(int i, int j, String word, char[] chars, char[][] grid) {
        i--;
        for (int w = 1; i >= 0; i--, w++) {
            if (chars[i] != word.charAt(w)) {
                return false;
            } else if (w + 1 == word.length()) {
                return true;
            }
        }
        return false;
    }
}
