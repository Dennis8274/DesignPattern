package org.xufeng.deng.algorithms.datastructure.graph;

/**
 * Created by deng.xufeng(一乐) on 2017/5/21.
 * <p>深度优先遍历
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class DFSTraverse {

    private static Boolean[] visited = new Boolean[UDNBuilder.getVexs().length];

    private static UDNG g = UDNBuilder.buildUDNG();

    private static int getNextVex(Integer[] vexs, int lastIndex) {
        int result = Integer.MAX_VALUE;
        if (lastIndex < vexs.length - 1) {
            for (int i = lastIndex; i < vexs.length; ++i) {
                if (vexs[i].compareTo(Integer.MAX_VALUE) < 0 && !visited[i]) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    private static boolean visit(int vexIndex) {
        boolean flag = false;
        if (!visited[vexIndex]) {
            visited[vexIndex] = true;
            flag = true;
            System.out.println(g.getVexs()[vexIndex]);
        }
        return flag;
    }

    private static Integer getFirstVex(UDNG g, int vexIndex) {
        Integer firstVexIndex = Integer.MAX_VALUE;
        Integer[] arcs = g.getArcs()[vexIndex];
        for (int i = 0; i < arcs.length; ++i) {
            if (!arcs[i].equals(Integer.MAX_VALUE)) {
                firstVexIndex = i;
                break;
            }
        }

        return firstVexIndex;

    }

    private static void DFSTraverseGraph(UDNG g) {

    }

    private static void DFS(UDNG g, int vex) {
        visit(vex);
        visited[vex] = true;
        for (Integer w = getFirstVex(g, vex); !w.equals(Integer.MAX_VALUE); w = getNextVex(g.getArcs()[vex], w)) {
            if (!visited[w]) {
                DFS(g, w);
            }
        }
    }


    public static void main(String[] args) {
        //初始化visited
        for (int i = 0; i < visited.length; ++i) {
            visited[i] = false;
        }

        for (int v = 0; v < g.getVexNum(); ++v) {
            if (!visited[v]) {
                DFS(g, v);
            }
        }
    }

}
