package org.xufeng.deng.algorithms.datastructure.list;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/10/2
 */
public class DelNLastNode {

    private static Node head;

    public static void main(String[] args) {
        int[] values = {2, 4, 5, 2, 1, 7, 0, 9};
        head = build(values);
        print(head);

        int n = 4;
        del(head, n);
        print(head);
    }

    private static void del(Node head, int n) {
        Node current = null;
        Node prev = null;
        Node node = head;
        while ((node = nextN(node, n)) != null) {
            prev = current;
            current = node;
        }

        if (prev == null) return;
        int lastC = nextC(current);
        Node delNodePrev = nextN(prev, lastC);
        Node delNode = delNodePrev.next;

        doDel(delNodePrev, delNode);
    }

    private static void doDel(Node prev, Node node) {
        prev.next = node.next;
        node.next = null;
    }

    private static int nextC(Node head) {
        int count = 0;
        while ((head = head.next) != null) {
            count++;
        }
        return count;
    }

    private static Node nextN(Node head, int n) {
        while (--n > 0 && (head = head.next) != null) ;

        return head;
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
        Node first = head;
        for (int i = 1; i < arr.length; ++i) {
            first.next = new Node(arr[i]);
            first = first.next;
        }

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
