package org.xufeng.deng.algorithms.datastructure.graph.shortpath;

import java.util.Arrays;

/**
 * Created by deng.xufeng(一乐) on 2017/5/25.
 * <p>利用迪杰特斯拉算法求得源点到各点的最短路径
 *
 * @author deng.xufeng
 */
public class Dijkstra {

    private static MGraph graph = new MGraph(6,8);

    private void dij(MGraph graph,int v0){
        //用dijkstra算法求有向图G的v0顶点到其余顶点v的最短路径P[v]及其带权长度D[v]
        // 其中P[v][w]为true，则w是v0到v当前求得的最短路径上的顶点
        boolean[][] P = new boolean[graph.getVexNum()][graph.getVexNum()];
        Integer[] D = new Integer[graph.getVexNum()];

        //final[v]为true，当且仅当v在最短路径顶点集合S中，即已求得v0到v的最短路径
        boolean[] finals = new boolean[graph.getVexNum()];

        for (int v=0;v<graph.getVexNum();++v){
            finals[v] = false;
            D[v] = graph.getArcs()[v0][v];
            for (int i=0;i<graph.getVexNum();++i){
                P[v][i] = false;
            }
            if (D[v]<Integer.MAX_VALUE){
                P[v][v0] = true;
                P[v][v] = true;
            }
        }

        // 初始化，v0顶点属于S
        D[v0] = 0;
        finals[v0] = true;

        //开始主循环，每次求得v0到某个v顶点的最短路径，并加v到S集
        for (int i=1;i<graph.getVexNum();++i){
            Integer min = Integer.MAX_VALUE;
            int v = -1;
            for (int w=0;w<graph.getVexNum();++w){
                if (!finals[w]){
                    if (D[w].compareTo(min)<0){
                        v = w;
                        min = D[w];
                    }
                }
            }

            if (v>0){
                finals[v] = true; // 将v并入S
                for (int w=0;w<graph.getVexNum();++w){ //更新当前最短路径及距离
                    if (!finals[w]&&graph.getArcs()[v][w]!=Integer.MAX_VALUE&&(D[w].compareTo(min+graph.getArcs()[v][w])>0)){
                        D[w] = min+graph.getArcs()[v][w];
                        // P[w] = P[v]+P[w]
                        P[w] = P[v];
                        P[w][w] = true;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(P));
        System.out.println();
        System.out.println(Arrays.deepToString(D));
    }

    public static void main(String[] args){
        new Dijkstra().dij(graph,0);
    }
}
