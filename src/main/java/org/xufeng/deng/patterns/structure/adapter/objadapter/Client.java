package org.xufeng.deng.patterns.structure.adapter.objadapter;

import org.xufeng.deng.patterns.structure.adapter.Adaptee;
import org.xufeng.deng.patterns.structure.adapter.ConcreteTarget;
import org.xufeng.deng.patterns.structure.adapter.Target;

/**
 * Created by deng.xufeng(一乐) on 2017/6/15.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Target target = new ConcreteTarget();
        target.request();

        Target adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
