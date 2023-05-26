package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }

    static public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }

        ArrayList<String> output = new ArrayList<>();
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            String s = list2[i];
            if (map1.containsKey(s)) {
                if (smallest > map1.get(s) + i) {
                    smallest = map1.get(s) + i;
                    output.clear();
                    output.add(s);
                } else if (smallest == map1.get(s) + i) {
                    output.add(s);
                }
            }
        }
        return output.toArray(new String[0]);
    }
}
