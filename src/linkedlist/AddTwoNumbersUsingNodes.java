package linkedlist;

public class AddTwoNumbersUsingNodes {
    public static void main(String[] args) {
        ListNode first = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode second = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode res = addTwoNumbers(first, second);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = new ListNode();
        head.next = temp;
        while (l1 != null && l2 != null) {
            temp.val = l1.val + l2.val;
            temp.next = new ListNode();
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return head.next;
    }
}
