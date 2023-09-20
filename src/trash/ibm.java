package trash;

import linkedlist.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ibm {
    public static void main(String[] args) {
        ListNode head = new ListNode(0, new ListNode(0, new ListNode(1,
                new ListNode(1, new ListNode(0, new ListNode(1, new ListNode(0)))))));
        List<Short> number = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            number.add((short) current.val);
            current = current.next;
        }
        int output = 0;
        for (int i = 0; i < number.size(); i++) {
            output += number.get(i) * (Math.pow(2, number.size() - 1 - i));
        }
        System.out.println(output);
    }

    public static void main1(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(20, 2, 3, 4, 4, 5, 9, 7, 8, 6, 10, 4, 5, 10, 10, 8, 4, 6, 4, 10,
                1));
        Collections.sort(arr); // 2,3,5,6,7
        int sum_right = arr.stream().reduce(0, Integer::sum);
        List<Integer> output = new ArrayList<>();
        int sum_left = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            Integer current_number = arr.get(i);
            if (sum_right <= sum_left) {
                break;
                //                return;
            }
            output.add(current_number);
            sum_left += current_number;
            sum_right -= current_number;
        }
        Collections.reverse(output);
        System.out.println(output);
    }
}
