package org.xufeng.deng.algorithms.datastructure.tree.binary.huffman;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by deng.xufeng(一乐) on 2017/5/19.
 * <p>赫夫曼树
 *
 * @author deng.xufeng
 */
@SuppressWarnings({"unused", "rawtypes", "unchecked"})
public class HuffmanTree {

    private static class Node<E> {
        E data;
        double weight;
        Character character;
        Node<E> lChild;
        Node<E> rChild;
        Node<E> parent;

        public Node(E data, double weight) {
            this.data = data;
            this.weight = weight;
        }

        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", weight=" + weight +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node<?> node = (Node<?>) o;

            return data != null ? data.equals(node.data) : node.data == null;
        }

        public int hashCode() {
            return data != null ? data.hashCode() : 0;
        }
    }

    public static void main(String[] args) {
        List<Node> lists = Lists.newArrayList();
        lists.add(new Node("A", 8.0));
        lists.add(new Node("B", 2.0));
        lists.add(new Node("C", 7.0));
        lists.add(new Node("D", 9.0));
        lists.add(new Node("E", 0.0));
        lists.add(new Node("F", 1.0));
        lists.add(new Node("G", 3.0));
        lists.add(new Node("H", 5.0));

        Node rootNode = createHuffmanTree(lists);

        Map<String, String> huffmanCode = Maps.newHashMap();
        Node nodeA = new Node("H", 0);
        String codeOfA = getHuffmanCode(rootNode, nodeA).toString();
        System.out.println(codeOfA);


    }

    /**
     * 从某个叶子结点出发，找到它的赫夫曼编码
     *
     */
    private static StringBuilder getHuffmanCode(Node rootNode, Node node) {
        StringBuilder codeBuilder = new StringBuilder();
        Node leafNode = getNode(rootNode, node);
        while (null != leafNode && null != leafNode.parent) {
            if (leafNode.equals(node)) {
                codeBuilder.append(leafNode.character);
            } else {
                codeBuilder.append(leafNode.character);
            }
            leafNode = leafNode.parent;
        }
        return codeBuilder.reverse();
    }

    private static Node getNode(Node rootNode, Node node) {
        Node resultNode = null;
        Stack<Node> stack = new Stack<>();
        stack.push(rootNode);
        while (!stack.isEmpty()) {
            Node rightNode = stack.pop();
            if (rightNode.equals(node)) {
                resultNode = rightNode;
                break;
            }
            if (null != rightNode.rChild) {
                stack.push(rightNode.rChild);
            }
            if (null != rightNode.lChild) {
                stack.push(rightNode.lChild);
            }
        }
        return resultNode;
    }


    private static Node createHuffmanTree(List<Node> nodes) {
        while (nodes.size() > 1) {
            quickSort(nodes, 0, nodes.size() - 1);
            Node leftChild = nodes.get(0);
            leftChild.character = '0';
            Node rightChild = nodes.get(1);
            rightChild.character = '1';

            Node parentNode = new Node(null, leftChild.weight + rightChild.weight);
            leftChild.parent = parentNode;
            rightChild.parent = parentNode;
            parentNode.lChild = leftChild;
            parentNode.rChild = rightChild;

            nodes.remove(0);
            nodes.remove(0);

            nodes.add(parentNode);
        }

        return nodes.get(0);
    }

    private static void swap(List<Node> lists, int i, int j) {
        Node tmp = lists.get(i);
        lists.set(i, lists.get(j));
        lists.set(j, tmp);
    }

    private static void quickSort(List<Node> lists, int start, int end) {
        if (start < end) {
            Node base = lists.get(start);
            int i = start;
            int j = end + 1;
            while (true) {
                while (i < end && lists.get(++i).weight <= base.weight) ;
                while (j > start && lists.get(--j).weight >= base.weight) ;
                if (i < j) {
                    swap(lists, i, j);
                } else {
                    break;
                }
            }

            swap(lists, start, j);

            quickSort(lists, start, j - 1);
            quickSort(lists, j + 1, end);
        }
    }
}
