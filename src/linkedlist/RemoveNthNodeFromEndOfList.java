package linkedlist;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        //ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
//        removeNthFromEnd(head, 2);
        ListNode head = new ListNode(1);
        removeNthFromEnd(head, 1);
    }

    static public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode faster = head;
        ListNode slower = head;
        for (int i = 0; i < n; i++) faster = faster.next;
        if (faster == null) return head.next;
        while (faster.next != null) {
            faster = faster.next;
            slower = slower.next;
        }
        slower.next = slower.next.next;
        return head;
    }
}
