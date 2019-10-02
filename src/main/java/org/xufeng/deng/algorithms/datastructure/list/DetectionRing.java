package org.xufeng.deng.algorithms.datastructure.list;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/10/2
 */
public class DetectionRing {

    private static Node head;

    public static void main(String[] args) {
        int[] values = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        head = buildRing(values);
        System.out.println(detect(head));
    }

    private static boolean detect(Node head) {
        Node next = head;
        while (next != null) {
            Node node = next.next;
            if (node == head) return true;
            next = node;
        }
        return false;
    }

    private static Node buildRing(int[] arr) {
        if (arr.length < 3) return null;

        Node head = new Node(arr[0]);
        Node tail = head;
        for (int i = 1; i < arr.length; ++i) {
            tail.next = new Node(arr[i]);
            tail = tail.next;
        }
        tail.next = head;

        return head;
    }

    static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
