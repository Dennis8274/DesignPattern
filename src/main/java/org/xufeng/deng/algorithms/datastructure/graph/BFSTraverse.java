package org.xufeng.deng.algorithms.datastructure.graph;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by deng.xufeng(一乐) on 2017/5/22.
 * <p>广度优先遍历
 *
 * @author deng.xufeng
 */
public class BFSTraverse {

    private static Boolean[] visited = new Boolean[UDNBuilder.getVexs().length];

    private static UDNG g = UDNBuilder.buildUDNG();


    public static void main(String[] args) {
        BFSTraverseGraph(g);
    }

    private static void BFSTraverseGraph(UDNG g) {
        for (int v = 0; v < g.getVexNum(); ++v) {
            visited[v] = false;
        }

        Queue<Integer> nodeQueue = new PriorityQueue<>();

        for (int index = 0; index < g.getVexNum(); ++index) {
            if (!visited[index]) {
                visit(index);
                nodeQueue.add(index);
                while (!nodeQueue.isEmpty()) {
                    Integer uIndex = nodeQueue.poll();
                    for (Integer w = getFirstAdjVex(g, uIndex); w.compareTo(Integer.MAX_VALUE) < 0
                            ; w = getNextAdjVex(g, uIndex, w)) {
                        if (!visited[w]) {
                            visit(w);
                            nodeQueue.add(w);
                        }
                    }
                }
            }
        }
    }

    private static boolean visit(int indexVex) {
        boolean result = false;
        if (!visited[indexVex]) {
            visited[indexVex] = true;
            System.out.println(g.getVexs()[indexVex]);
            result = true;
        }

        return result;
    }

    private static Integer getFirstAdjVex(UDNG g, int rightVex) {
        Integer[] vexs = g.getArcs()[rightVex];
        Integer resultVex = Integer.MAX_VALUE;
        for (int i = 0; i < vexs.length; ++i) {
            if (vexs[i].compareTo(Integer.MAX_VALUE) < 0) {
                resultVex = i;
                break;
            }
        }
        return resultVex;
    }

    private static Integer getNextAdjVex(UDNG g, int rightVex, int lastIndex) {
        Integer[] vexs = g.getArcs()[rightVex];
        Integer resultIndex = Integer.MAX_VALUE;
        for (int i = lastIndex + 1; i < vexs.length; ++i) {
            if (vexs[i].compareTo(Integer.MAX_VALUE) < 0) {
                resultIndex = i;
                break;
            }
        }

        return resultIndex;
    }
}
