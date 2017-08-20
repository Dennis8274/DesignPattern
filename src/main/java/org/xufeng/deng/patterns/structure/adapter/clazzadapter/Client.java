package org.xufeng.deng.patterns.structure.adapter.clazzadapter;

import org.xufeng.deng.patterns.structure.adapter.ConcreteTarget;
import org.xufeng.deng.patterns.structure.adapter.Target;

/**
 * Created by deng.xufeng(一乐) on 2017/6/15.
 * <p>客户端
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Target target = new ConcreteTarget();
        target.request();

        Target adapter = new Adapter();
        adapter.request();
    }
}
