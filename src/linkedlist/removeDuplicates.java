package linkedlist;

public class removeDuplicates {
    public static void main(String[] args) {
        ListNode node = deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2))));
        ListNode node2 = deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(3))))));

        System.out.println();
    }

    static public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode previous = head;
        ListNode following = head.next;

        while (following != null) {
            if (following.val == previous.val) {
                previous.next = following.next;
            } else {
                previous = previous.next;
            }
            following = following.next;
        }
        return head;
    }
}
