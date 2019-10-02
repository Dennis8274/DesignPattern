package org.xufeng.deng.algorithms.datastructure.list;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/10/2
 */
public class DoublyListSort {
    private static Node head;
    private static Node tail;

    public static void main(String[] args) {
        int[] values = {2, 4, 6, 8, 2, 4, 6, 8, 9, 7, 5, 9, 7, 5};
        head = build(values);

        sort(head, tail);
        print();

    }

    private static void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    private static void sort(Node head, Node tail) {
        if (head == null || tail == null || head == tail) return;
        Node pivot = partition(head, tail);
        if (pivot != head) sort(head, pivot.prev);
        if (pivot != tail) sort(pivot.next, tail);
    }

    private static Node partition(Node head, Node tail) {
        Node node = head;
        Node nextNode = head;
        while (nextNode != tail) {
            if (nextNode.value < tail.value) {
                // swap node and nextNode
                swap2(node, nextNode);
                node = node.next;
            }
            nextNode = nextNode.next;
        }

        // swap
        swap2(node, tail);

        return node;
    }

    private static void swap2(Node first, Node second) {
        int value = first.value;
        first.value = second.value;
        second.value = value;
    }

    private static void swap(Node first, Node second) {
        Node firstPrev = first.prev;
        Node firstNext = first.next;
        Node secondPrev = second.prev;
        Node secondNext = second.next;

        first.prev = secondPrev;
        first.next = secondNext;
        second.prev = firstPrev;
        second.next = firstNext;

        firstPrev.next = second;
        firstNext.prev = secondPrev;
        secondPrev.next = first;
        secondNext.next = firstPrev;
    }

    private static Node build(int[] arr) {
        if (arr.length < 1) return null;
        Node prev = new Node(arr[0]);
        Node head = prev;
        for (int i = 1; i < arr.length; ++i) {
            Node node = new Node(arr[i]);
            prev.next = node;
            node.prev = prev;

            prev = node;
        }

        tail = prev;

        return head;
    }

    static class Node {
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
