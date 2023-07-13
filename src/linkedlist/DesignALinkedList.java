package linkedlist;

public class DesignALinkedList {
    Link head;
    int size;

    public DesignALinkedList() {
    }

    public static void main(String[] args) {
        //        test1();
        //        test2();
        //        test3();
        //        test4();
        //        test8();
        //        test10();
        //        test20();
        test62();
    }

    private static void test62() {
        //"MyLinkedList","addAtTail","addAtTail","get"
        //1,3,1
        DesignALinkedList d = new DesignALinkedList();
        d.addAtTail(1);
        d.addAtTail(3);
        System.out.println(d.get(1));
    }

    private static void test20() {
        //["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
        //[[],[1],[3],[1,2],[1],[1],[1]]
        DesignALinkedList d = new DesignALinkedList();
        d.addAtHead(1);
        d.addAtTail(3);
        d.addAtIndex(1, 2);
        System.out.println(d.get(1));
        d.deleteAtIndex(1);
        System.out.println(d.get(1));
    }

    private static void test10() {
        DesignALinkedList d = new DesignALinkedList();
        d.addAtHead(4);
        d.get(1);
        d.addAtHead(1);
        d.addAtHead(5);
        d.deleteAtIndex(3);
        d.addAtHead(7);
        d.get(3);
        d.get(3);
        d.get(3);
        d.addAtHead(1);
        d.deleteAtIndex(4);

    }

    private static void test8() {
        DesignALinkedList d = new DesignALinkedList();
        d.addAtHead(2);
        d.deleteAtIndex(1);
        d.addAtHead(2);
        d.addAtHead(7);
        d.addAtHead(3);
        d.addAtHead(2);
        d.addAtTail(5);
        System.out.println(d.get(5));

        d.deleteAtIndex(6);
        d.deleteAtIndex(4);

    }

    private static void test4() {
        DesignALinkedList list = new DesignALinkedList();
        list.addAtIndex(0, 10);
        list.addAtIndex(0, 20);
        list.addAtIndex(1, 30);
        System.out.println(list.get(0));
    }

    private static void test3() {
        DesignALinkedList task = new DesignALinkedList();
        task.addAtHead(1);
        task.deleteAtIndex(0);

    }

    private static void test2() {
        DesignALinkedList task = new DesignALinkedList();
        task.addAtHead(1);
        task.addAtTail(3);
        task.addAtIndex(1, 2);
        System.out.println(task.get(1));
        task.deleteAtIndex(1);
        task.get(1);
    }

    public static void test1() {
        DesignALinkedList task = new DesignALinkedList();
        task.addAtHead(7);
        task.addAtHead(2);
        task.addAtHead(1);
        task.addAtIndex(3, 0);
        int i = 0;
        task.deleteAtIndex(2);
        i = 1;
        task.addAtHead(6);
        task.addAtTail(4);
        System.out.println(task.get(4));
    }

    public int get(int index) {
        if (index >= size)
            return -1;
        Link t = head;
        for (int i = 0; i < index; i++) {
            t = t.next;
        }
        return t.val;
    }

    public void addAtHead(int val) {
        head = new Link(val, head);
        size++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Link t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = new Link(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size)
            return;
        if (index == size) {
            addAtTail(val);
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Link t = head;
        for (int i = 0; i < index - 1; i++) {
            t = t.next;
        }
        t.next = new Link(val, t.next);
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size)
            return;
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Link t = head;
        for (int i = 1; i < index; i++) {
            t = t.next;
        }

        t.next = t.next.next;
        size--;
    }

    private class Link {
        int val;
        Link next;

        Link(int val, Link next) {
            this.next = next;
            this.val = val;
        }

        Link() {
        }

        public Link(int val) {
            this.val = val;
        }
    }
}
