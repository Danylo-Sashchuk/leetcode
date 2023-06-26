package linkedlist;

public class AddTwoNumbersUsingNodes {
    public static void main(String[] args) {
        ListNode first = new ListNode(2, new ListNode(4, new ListNode(4)));
        ListNode second = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode res = addTwoNumbers(first, second);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
        first = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        second = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9)))))));
        res = addTwoNumbers(first, second);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        ListNode head = temp;
        boolean isOverFlowed = false;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val;
            if (isOverFlowed) {
                sum++;
                isOverFlowed = false;
            }
            if (sum >= 10) {
                isOverFlowed = true;
                sum -= 10;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = l1.val;
            if (isOverFlowed) {
                sum++;
                isOverFlowed = false;
            }
            if (sum >= 10) {
                isOverFlowed = true;
                sum -= 10;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val;
            if (isOverFlowed) {
                sum++;
                isOverFlowed = false;
            }
            if (sum >= 10) {
                isOverFlowed = true;
                sum -= 10;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            l2 = l2.next;
        }

        if (isOverFlowed) {
            temp.next = new ListNode(1);
        }
        return head.next;
    }
}
