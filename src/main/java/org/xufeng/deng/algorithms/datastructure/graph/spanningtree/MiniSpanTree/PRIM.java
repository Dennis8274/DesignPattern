package org.xufeng.deng.algorithms.datastructure.graph.spanningtree.MiniSpanTree;

import com.google.common.collect.Maps;
import org.xufeng.deng.algorithms.datastructure.graph.spanningtree.Arc;
import org.xufeng.deng.algorithms.datastructure.graph.spanningtree.UGraph;
import org.xufeng.deng.algorithms.datastructure.graph.spanningtree.UGraphBuilder;
import org.xufeng.deng.algorithms.datastructure.graph.spanningtree.Vex;

import java.util.Map;

/**
 * Created by deng.xufeng(一乐) on 2017/5/23.
 * <p>普里姆（prim）算法生成最小生成树
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class PRIM {

    private static UGraph g = UGraphBuilder.buildUGraph();

    public static void main(String[] args) {
        prim(g, g.getVexs().get(0));
    }

    private static void prim(UGraph g, Vex<String> vex) {
        Map<String, Integer> closeEdge = Maps.newHashMap();

        Arc arc = vex.getFirstArc();
        Vex<String> tmpVex;

        for (; arc != null; arc = arc.getConVex().getFirstArc()) {
            tmpVex = arc.getConVex();
            closeEdge.put(tmpVex.getData(), arc.getWeight());
        }

        visit(g.getVexs().indexOf(vex));
        closeEdge.put(vex.getData(), 0);

        for (int i = 0; i < g.getVexNum() - 1; ++i) {
            int nextVexIndex = minimum(closeEdge);
            visit(nextVexIndex);
            closeEdge.put(g.getVexs().get(nextVexIndex).getData(), 0);
            //TODO 重复初始化closeEdge操作 bye goodnight
            Arc tmpArc = g.getVexs().get(nextVexIndex).getFirstArc();
            Vex<String> tmpVex2;
            for (; tmpArc != null; tmpArc = tmpArc.getConVex().getFirstArc()) {
                tmpVex2 = tmpArc.getConVex();
                if (closeEdge.get(tmpVex2.getData()) == null
                        || tmpArc.getWeight() < closeEdge.get(tmpVex2.getData())) {
                    closeEdge.put(tmpVex2.getData(), tmpArc.getWeight());
                }
            }
        }
    }

    private static void visit(int index) {
        System.out.println(g.getVexs().get(index).getData());
    }

    private static int minimum(Map<String, Integer> closeEdge) {
        int result = -1;
        Integer min = Integer.MAX_VALUE;
        String data = "";
        for (Map.Entry<String, Integer> entry : closeEdge.entrySet()) {
            if (min.compareTo(entry.getValue()) > 0 && entry.getValue().compareTo(0) > 0) {
                min = entry.getValue();
                data = entry.getKey();
            }
        }

        if (!"".equals(data)) {
            result = g.getVexs().indexOf(new Vex<>(data, null));
        }

        return result;
    }
}
