package org.xufeng.deng.algorithms.datastructure.list;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/9/30
 */
public class ReverseList {

    private static Node head;

    public static void main(String[] args) {
        build();
        print();
        System.out.println();
        head = reverse(head);
        print();
        System.out.println();
        head = reverse2(head);
        print();
    }

    private static void build() {
        int i = 1;
        head = new Node(i);
        Node node = head;
        Node next;
        while (++i <= 10) {
            next = new Node(i);
            node.next = next;
            node = next;
        }
    }

    private static void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + (node.next == null ? "" : " "));
            node = node.next;
        }
    }

    private static Node reverse(Node prev) {
        if (prev == null || prev.next == null) return prev;

        Node head = reverse(prev.next);

        Node next = prev.next;
        next.next = prev;
        prev.next = null;

        return head;
    }

    private static Node reverse2(Node node) {
        Node prev = null;
        Node current = node;
        while (current != null) {
            Node next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }

    static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }

}
