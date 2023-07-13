package trash;

import java.util.Arrays;
import java.util.List;

public class asListTest {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
        List<String> list = Arrays.asList(strings);
        list.set(0, "d");
        System.out.println(list);
        System.out.println(Arrays.toString(strings));
        strings = new String[]{"a", "b", "c"};
        System.out.println(

        );
        System.out.println(list);
        System.out.println(Arrays.toString(strings));

        int[] a = {1, 2, 3};
        List<Integer> l = Arrays.asList(a);
    }
}
