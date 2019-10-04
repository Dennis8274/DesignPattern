package org.xufeng.deng.algorithms.datastructure.stack;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/10/4
 */
public class SymbolMatch {
    private static Node stack;

    public static void main(String[] args) {
        String str = "{[(236)]}()(){}[{(12)()[]{456{[]}}}]";
        char[] chars = str.toCharArray();
        System.out.println(match(chars));
    }

    private static boolean match(char[] chars) {
        for (char ch : chars) {
            int value = Brackets.getValue(ch);
            if (value != -1) {
                if (value >>> 8 > 0) {
                    char popChar = pop();
                    if (popChar == 'e') return false;
                    if (!Brackets.match(Brackets.getValue(popChar), value)) {
                        return false;
                    }
                } else {
                    push(ch);
                }
            }
        }

        return true;
    }

    private static Node build(char[] arr) {
        if (arr.length < 1) return null;
        Node node = null;
        Node prev = null;
        for (char c : arr) {
            node = new Node(c);
            node.next = prev;
            prev = node;
        }

        return node;
    }

    private static void push(char ch) {
        Node node = new Node(ch);
        node.next = stack;
        stack = node;
    }

    private static char pop() {
        if (stack == null) return 'e';

        Node node = stack;
        stack = node.next;

        return node.value;
    }

    enum Brackets {
        A('(', 1),
        B('{', 1 << 1),
        C('[', 1 << 2),
        AA(')', (1 << 8) | 0xff),
        BB('}', (2 << 8) | 0xff),
        CC(']', (4 << 8) | 0xff);

        private char ch;
        private int value;

        Brackets(char ch, int spouse) {
            this.ch = ch;
            this.value = spouse;
        }

        static int getValue(char ch) {
            for (Brackets brackets : Brackets.values()) {
                if (brackets.ch == ch) return brackets.value;
            }

            return -1;
        }

        static boolean match(int ch, int spouse) {
            int value = ch & (spouse >>> 8);
            return value > 0;
        }

    }

    static class Node {
        private char value;
        private Node next;

        Node(char value) {
            this.value = value;
        }
    }
}
