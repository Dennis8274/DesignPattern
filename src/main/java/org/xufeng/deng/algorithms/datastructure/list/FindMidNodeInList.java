package org.xufeng.deng.algorithms.datastructure.list;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/10/3
 */
public class FindMidNodeInList {

    private static Node head;

    private static boolean evenCount = false;

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        head = build(values);
        print(head);

        Node node = find(head);
        System.out.println(node.value + " " + (evenCount ? node.next.value : ""));
    }

    private static Node find(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next != null) evenCount = true;

        return slow;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node build(int[] arr) {
        if (arr.length < 1) return null;
        Node head = new Node(arr[0]);
        Node next = head;
        for (int i = 1; i < arr.length; ++i) {
            Node node = new Node(arr[i]);
            next.next = node;

            next = node;
        }

        return head;
    }

    static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }

}
