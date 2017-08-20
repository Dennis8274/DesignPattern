package org.xufeng.deng.algorithms.datastructure.graph.connectivity.topologicsort;

import org.xufeng.deng.algorithms.datastructure.graph.connectivity.ALArc;
import org.xufeng.deng.algorithms.datastructure.graph.connectivity.ALGraph;
import org.xufeng.deng.algorithms.datastructure.graph.connectivity.ALGraphBuilder;
import org.xufeng.deng.algorithms.datastructure.graph.connectivity.ALVex;

import java.util.Stack;

/**
 * Created by deng.xufeng(一乐) on 2017/5/24.
 * <p>求拓扑排序
 *
 * @author deng.xufeng
 */
public class TopologicalSort {

    private ALGraph g;

    private boolean topologicalSort(ALGraph g) {
        int[] inDegree = g.getInDegree();
        Stack<ALVex<String>> stack = new Stack<>();
        for (int i = 0; i < g.getVexNum(); ++i) {
            if (inDegree[i] == 0) {
                stack.push(g.getVexs().get(i));
            }
        }

        int count = 0; //对输出顶点进行计数
        while (!stack.isEmpty()) {
            ALVex<String> rightALVex = stack.pop();
            visit(rightALVex);
            ++count;
            ALArc<String> arc;
            do {
                arc = rightALVex.getFirstArc();
                int index = g.getVexs().indexOf(rightALVex);
                if (inDegree[index] > 0 && (--inDegree[index]) == 0) {
                    stack.push(g.getVexs().get(index));
                }
                rightALVex = arc==null ? null : arc.getConVex();
            } while (arc != null);
        }

        return count >= g.getVexNum();

    }

    private void visit(ALVex<String> vex) {
        System.out.println(vex.getData());
    }


    public static void main(String[] args) {
        new TopologicalSort().topologicalSort(ALGraphBuilder.buildALGraph());
    }
}
