package org.xufeng.deng.algorithms.datastructure.graph.spanningtree;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/5/23.
 * <p>
 *
 * @author deng.xufeng
 */
public class UGraphBuilder {
    private static UGraph g;
    private static String[] vexData = {"V1","V2","V3","V4","V5","V6"};
    private static Integer[][] arcs = {
            {Integer.MAX_VALUE,6,1,5,Integer.MAX_VALUE,Integer.MAX_VALUE},
            {6,Integer.MAX_VALUE,5,Integer.MAX_VALUE,3,Integer.MAX_VALUE},
            {1,5,Integer.MAX_VALUE,5,6,4},
            {6,Integer.MAX_VALUE,5,Integer.MAX_VALUE,Integer.MAX_VALUE,2},
            {Integer.MAX_VALUE,3,6,Integer.MAX_VALUE,Integer.MAX_VALUE,6},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,4,2,6,Integer.MAX_VALUE}
    };

    public static UGraph buildUGraph(){
        if (g == null){
            g = new UGraph(6,10);
            List<Vex<String>> vexs = Lists.newArrayList();
            for (int i=0;i<vexData.length;++i){
                Vex<String> vex = new Vex<>(vexData[i],null);
                Integer[] rightArcs = arcs[i];
                vexs.add(vex);
                for (int j=0;j<rightArcs.length;++j){
                    if (rightArcs[j].compareTo(Integer.MAX_VALUE)<0){
                        Vex<String> tmpVex = new Vex<>(vexData[j],null);
                        Arc<String> arc = new Arc<>(rightArcs[j],tmpVex);
                        vex.setFirstArc(arc);
                        vex = tmpVex;
                    }
                }
            }
            g.setVexs(vexs);
        }
        return g;
    }

    public static void main(String[] args){
        buildUGraph();
    }
}
