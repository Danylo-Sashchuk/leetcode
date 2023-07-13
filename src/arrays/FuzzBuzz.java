package arrays;

import java.util.ArrayList;
import java.util.List;

public class FuzzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder builder;
        for (int i = 1; i <= n; i++) {
            builder = new StringBuilder();
            if (i % 3 == 0)
                builder.append("Fizz");
            if (i % 5 == 0)
                builder.append("Buzz");
            if (builder.isEmpty())
                builder.append(i);
            res.add(builder.toString());
        }
        return res;
    }
}
