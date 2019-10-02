package org.xufeng.deng.algorithms.datastructure.list;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/10/2
 */
public class Merge2OrderedList {
    private static Node firstHead;
    private static Node secondHead;

    private static int[] first = {1, 3, 5, 7, 9};
    private static int[] second = {2, 4, 6, 8, 10, 12, 14};

    public static void main(String[] args) {
        firstHead = buildOrderedList(first);
        secondHead = buildOrderedList(second);
        Node finalNode = merge(firstHead, secondHead);
        print(finalNode);
    }

    private static Node merge(Node first, Node second) {
        Node finalNode = new Node(-1);
        Node node = finalNode;
        Node next;
        while (first != null && second != null) {
            int firstValue = first.value;
            int secondValue = second.value;
            if (firstValue <= secondValue) {
                next = first;
                first = first.next;
            } else {
                next = second;
                second = second.next;
            }
            finalNode.next = next;
            finalNode = finalNode.next;
        }

        while (first != null) {
            finalNode.next = first;
            finalNode = finalNode.next;
            first = first.next;
        }

        while (second != null) {
            finalNode.next = second;
            finalNode = finalNode.next;
            second = second.next;
        }

        return node.next;
    }

    private static void print(Node head) {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    private static Node buildOrderedList(int[] arr) {
        Node head = null;
        Node prev = null;
        for (int value : arr) {
            Node node = new Node(value);
            if (prev == null) {
                head = prev = node;
            } else {
                prev.next = node;
                prev = node;
            }
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
