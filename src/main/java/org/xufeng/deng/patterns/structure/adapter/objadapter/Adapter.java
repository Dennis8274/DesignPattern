package org.xufeng.deng.patterns.structure.adapter.objadapter;

import org.xufeng.deng.patterns.structure.adapter.Adaptee;
import org.xufeng.deng.patterns.structure.adapter.Target;

/**
 * Created by deng.xufeng(一乐) on 2017/6/15.
 * <p>对象适配器，适配(关联)目标和特殊实现，可适配好几个特殊行为
 *
 * @author deng.xufeng
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() { //可适配好几个特殊行为
        adaptee.specificRequest();
    }
}
