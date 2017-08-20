package org.xufeng.deng.algorithms.datastructure.graph.shortpath;

import java.util.Arrays;

/**
 * Created by deng.xufeng(一乐) on 2017/5/26.
 * <p>弗洛伊德（Floyd）算法求每一对顶点间的最短路径
 *
 * @author deng.xufeng
 */
public class Floyd {
    private FMGraph graph = new FMGraph(3,5);

    private static void floyd(FMGraph graph){
        //用Floyd算法求有向网中各对顶点v和w之间的最短路径P[v][w]以及带权路径D[v][w]。
        //若P[v][w][u]为true，则u是从v到w当前求得最短路径上的顶点。
        boolean[][][] P = new boolean[graph.getVexNum()][graph.getVexNum()][graph.getVexNum()];//path
        Integer[][] D = new Integer[graph.getVexNum()][graph.getVexNum()];//distance

        for (int v=0;v<graph.getVexNum();++v){ //初始化各对结点之间已知路径及距离
            for (int w=0;w<graph.getVexNum();++w){
                D[v][w] = graph.getArcs()[v][w];
                for (int u=0;u<graph.getVexNum();++u){
                    P[v][w][u] = false;
                }
                if (D[v][w].compareTo(Integer.MAX_VALUE)<0){ //v到w有直接路径
                    P[v][w][v] = true;
                    P[v][w][w] = true;
                }
            }
        }

        for (int u=0;u<graph.getVexNum();++u){
            for (int v=0;v<graph.getVexNum();++v){
                for (int w=0;w<graph.getVexNum();++w){
                    if ((D[v][u]+D[u][w])<D[v][w]){
                        D[v][w] = D[v][u] + D[u][w];
                        for (int i=0;i<graph.getVexNum();++i){
                            P[v][w][i] = P[v][u][i] || P[u][w][i];
                        }
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(D));
        System.out.println(Arrays.deepToString(P));
    }

    public static void main(String[] args){
        floyd(new Floyd().graph);
    }
}
