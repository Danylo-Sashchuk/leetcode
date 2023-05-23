package doublepointers;

public class MaximumVowelsInSubstring { //TODO блять почини ты эту залупу уже почему оно не работает ты можешь мне
    //TODO скаазать ебанько косоглазое
    public static void main(String[] args) {
        System.out.println(maxVowels("aeiou", 3));
        System.out.println(maxVowels("weallloveyou", 7));
    }

    static public int maxVowels(String s, int k) {
        int left = 0;
        int right = k - 1;
        int max = 0;
        String vowels = "aeiou";
        for (int i = left; i < right; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                max++;
            }
        }
        int tMax = max;
        while (right < s.length()) {
            left++;
            if (vowels.indexOf(s.charAt(left)) != -1) {
                tMax--;
            }
            right++;
            if (vowels.indexOf(s.charAt(right)) != -1) {
                tMax++;
            }
            max = Math.max(tMax, max);
        }
        return max;
    }
}
