package org.xufeng.deng.algorithms.leetcode;

/**
 * Created by deng.xufeng(一乐) on 2017/7/25.
 * <p>algorithms 2 linked list 相加，具体要求查看description
 *
 * @author deng.xufeng
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] leftValues = {1,3,5,7};
        int[] rightValues = {2,4,6,8};
        ATNListNode left = buildNode(leftValues);
        ATNListNode right = buildNode(rightValues);
        ATNListNode resultNode = addTwoNumbers(left,right);
    }

    /**
     * 两数相加
     */
    private static ATNListNode addTwoNumbers(ATNListNode leftNode,ATNListNode rightNode){
        ATNListNode lNode = leftNode;
        ATNListNode rNode = rightNode;
        ATNListNode sentinel = new ATNListNode(0);
        ATNListNode participant = sentinel;

        int sum = 0;
        while (null != lNode || null != rNode){
            sum /=10; //进位

            if (null != lNode) {
                sum += lNode.val;
                lNode = lNode.next;
            }

            if (null != rNode){
                sum += rNode.val;
                rNode = rNode.next;
            }

            participant.next = new ATNListNode(sum % 10);
            participant = participant.next;
        }
        participant.next = new ATNListNode(sum/10);

        return sentinel;
    }

    private static ATNListNode buildNode(int[] values){
        ATNListNode node = new ATNListNode(values[0]);
        ATNListNode tmpNode = node;
        for (int i=1;i<values.length;++i){
            tmpNode.next = new ATNListNode(values[i]);
            tmpNode = tmpNode.next;
        }
        return node;
    }
}
