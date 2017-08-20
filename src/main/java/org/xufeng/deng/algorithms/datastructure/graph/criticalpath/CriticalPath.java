package org.xufeng.deng.algorithms.datastructure.graph.criticalpath;

import org.xufeng.deng.algorithms.datastructure.graph.connectivity.ALArc;
import org.xufeng.deng.algorithms.datastructure.graph.connectivity.ALGraph;
import org.xufeng.deng.algorithms.datastructure.graph.connectivity.ALGraphBuilder;
import org.xufeng.deng.algorithms.datastructure.graph.connectivity.ALVex;

import java.util.Stack;

/**
 * Created by deng.xufeng(一乐) on 2017/5/24.
 * <p>关键路径求解
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class CriticalPath {

    private static ALGraph graph = ALGraphBuilder.buildVOE();
    private static int[] ve = new int[graph.getVexNum()];

    private static void visit(ALVex<String> vex) {
        System.out.println(vex.getData());
    }

    private static boolean topologicalOrder(ALGraph g, Stack<ALVex<String>> sortStack) {
        int[] inDegree = g.getInDegree();
        Stack<ALVex<String>> stack = new Stack<>();
        for (int i = 0; i < g.getVexNum(); ++i) {
            if (inDegree[i] == 0) {
                stack.push(g.getVexs().get(i));
            }
        }

        int count = 0; //对输出顶点进行计数

        for (int i = 0; i < ve.length; ++i) {
            ve[i] = 0;
        }


        while (!stack.isEmpty()) {
            ALVex<String> rightALVex = stack.pop();
            visit(rightALVex);
            sortStack.push(rightALVex);
            ++count;
            ALArc<String> arc;
            do {
                arc = rightALVex.getFirstArc();
                int index = g.getVexs().indexOf(rightALVex);
                if (inDegree[index] > 0 && (--inDegree[index]) == 0) {
                    stack.push(g.getVexs().get(index));
                }

                rightALVex = arc == null ? null : arc.getConVex();

                if (rightALVex != null
                        && (ve[index] + arc.getWeight()) > ve[g.getVexs().indexOf(rightALVex)]) {
                    ve[g.getVexs().indexOf(rightALVex)] = ve[index] + arc.getWeight();
                }
            } while (arc != null);
        }

        return count >= g.getVexNum();
    }

    private static void criticalPath(ALGraph graph) {
        Stack<ALVex<String>> T = new Stack<>();
        if (!topologicalOrder(graph, T)) {
            return;
        }

        int[] vl = ve;

        while (!T.isEmpty()) {
            ALVex<String> rightVex = T.pop();
            ALArc<String> arc = rightVex.getFirstArc();
            int rightIndex = graph.getVexs().indexOf(rightVex);
            for (ALVex<String> tmpVex = rightVex; arc != null; arc = tmpVex.getFirstArc()) {
                tmpVex = arc.getConVex();
                int k = graph.getVexs().indexOf(tmpVex);
                if (vl[k] - arc.getWeight() < vl[rightIndex]) {
                    vl[rightIndex] = vl[k] + arc.getWeight();
                }
            }
        }

        for (int i = 0; i < graph.getVexNum(); ++i) {
            ALVex<String> alVex = graph.getVexs().get(i);
            ALArc<String> rightArc = alVex.getFirstArc();
            for (ALVex<String> tmpVex = alVex; rightArc != null; rightArc = tmpVex.getFirstArc()) {
                tmpVex = rightArc.getConVex();
                int k = graph.getVexs().indexOf(tmpVex);
                int ee = ve[i];
                int el = vl[k] - rightArc.getWeight();
                char tag = (ee == el) ? '*' : ' ';
                System.out.println(alVex.getData() + "->" + tmpVex.getData() + " weight=" + rightArc.getWeight() + " ee=" + ee + " el=" + el + " " + tag);
            }
        }
    }

    public static void main(String[] args) {
        criticalPath(graph);
    }
}
