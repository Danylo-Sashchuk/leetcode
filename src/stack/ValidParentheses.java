package stack;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[]"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("("));
        System.out.println(isValid("))]]"));
    }
    public static boolean isValid(String s) {
        HashMap<Character, Character> paran = new HashMap<>();
        paran.put('(', ')');
        paran.put('{', '}');
        paran.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (paran.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
            if (paran.containsValue(s.charAt(i))) {
                if (stack.empty() || paran.get(stack.pop()) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
