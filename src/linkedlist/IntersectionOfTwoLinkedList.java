package linkedlist;

public class IntersectionOfTwoLinkedList {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5, null)))));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4,
                new ListNode(5, null))))));

        ListNode common = new ListNode(1, null);
        headA = common;
        headB = common;
        ListNode intersect = getIntersectionNode(headA, headB);
        System.out.println(intersect.val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int firstSize = 0;
        int secondSize = 0;

        ListNode temp = headA;
        while (temp != null && temp.next != null) {
            temp = temp.next;
            firstSize++;
        }
        temp = headB;
        while (temp != null && temp.next != null) {
            temp = temp.next;
            secondSize++;
        }

        ListNode firstHead = headA;
        ListNode secondHead = headB;
        if (firstSize > secondSize) {
            firstHead = countOff(headA, firstSize - secondSize);
        } else {
            secondHead = countOff(headB, secondSize - firstSize);
        }

        while (firstHead != null && secondHead != null && firstHead.next != null && secondHead.next != null) {
            if (firstHead == secondHead)
                return firstHead;
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }
        return null;
    }

    private static ListNode countOff(ListNode head, int offset) {
        ListNode tmp = head;
        for (int i = 0; i < offset; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }
}
