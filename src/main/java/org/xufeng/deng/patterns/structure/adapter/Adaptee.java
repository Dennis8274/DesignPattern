package org.xufeng.deng.patterns.structure.adapter;

/**
 * Created by deng.xufeng(一乐) on 2017/6/15.
 * <p>待适配类
 *
 * @author deng.xufeng
 */
public class Adaptee {
    public void specificRequest(){
        System.out.println("被适配，实现特殊功能");
    }
}
