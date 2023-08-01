package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth1(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    public static int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                .map(account -> Arrays.stream(account).sum())
                .max(Comparator.naturalOrder())
                .get();
    }
}
