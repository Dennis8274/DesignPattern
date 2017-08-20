package org.xufeng.deng.algorithms.datastructure.graph.connectivity;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/5/24.
 * <p>构建有向图
 *
 * @author deng.xufeng
 */
public class ALGraphBuilder {

    private static ALGraph g;
    private static String[] vexData = {"V1","V2","V3","V4","V5","V6",};
    private static Boolean[][] arcs = {
            {false,true,true,true,false,false},
            {false,false,false,false,false,false},
            {false,true,false,false,true,false},
            {false,false,false,false,true,false},
            {false,false,false,false,false,false},
            {false,false,false,true,true,false}
    };

    private static String[] alVexData = {"V1","V2","V3","V4","V5","V6","V7","V8","V9"};
    private static Integer[][] alArcs = {
            {Integer.MAX_VALUE,6,4,5,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,1,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,1,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,2,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,9,7,
                    Integer.MAX_VALUE},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,4,
                    Integer.MAX_VALUE},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer
                    .MAX_VALUE,2},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer
                    .MAX_VALUE,4},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer
                    .MAX_VALUE,Integer.MAX_VALUE}
    };

    public static ALGraph buildVOE(){
        if (g==null){
            g = new ALGraph(alVexData.length,11);
            List<ALVex<String>> vexs = Lists.newArrayList();
            int[] inDegree = new int[alVexData.length];
            for (int i=0;i<alVexData.length;++i){
                Integer[] rightArcs = alArcs[i];
                ALVex<String> vex = new ALVex<>(alVexData[i],null);
                vexs.add(vex);
                for (int j=0;j<alVexData.length;++j){
                    if (rightArcs[j].compareTo(Integer.MAX_VALUE)<0){
                        inDegree[j] += 1;
                        ALVex<String> tmpVex = new ALVex<>(alVexData[j],null);
                        ALArc<String> arc = new ALArc<>(rightArcs[j],tmpVex);
                        vex.setFirstArc(arc);
                        vex = tmpVex;
                    }
                }
            }

            g.setVexs(vexs);
            g.setInDegree(inDegree);

            for (int i=0;i<inDegree.length;++i){
                ALVex<String> alVex = g.getVexs().get(i);
                alVex.setInDegree(inDegree[i]);
            }
        }
        return g;
    }

    public static ALGraph buildALGraph(){
        if (g == null){
            g = new ALGraph(vexData.length,8);
            List<ALVex<String>> vexs = Lists.newArrayList();
            int[] inDegree = new int[vexData.length];
            for (int i=0;i<vexData.length;++i){
                Boolean[] rightArcs = arcs[i];
                ALVex<String> vex = new ALVex<>(vexData[i],null);
                vexs.add(vex);
                for (int j=0;j<rightArcs.length;++j){
                    if (rightArcs[j]){
                        inDegree[j] += 1;
                        ALVex<String> tmpVex = new ALVex<>(vexData[j],null);
                        ALArc<String> arc = new ALArc<>(tmpVex);
                        vex.setFirstArc(arc);
                        vex = tmpVex;
                    }
                }
            }

            g.setVexs(vexs);
            g.setInDegree(inDegree);

            for (int i=0;i<inDegree.length;++i){
                ALVex<String> alVex = g.getVexs().get(i);
                alVex.setInDegree(inDegree[i]);
            }
        }
        return g;
    }

    public static void main(String[] args){
        buildVOE();
    }
}
