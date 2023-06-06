package linkedlist;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode t = oddEvenList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(5))))));
        int[][] dim = new int[5][10];
        System.out.println(dim.length);
        System.out.println(t);
    }

    static public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}