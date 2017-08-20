package org.xufeng.deng.patterns.structure.adapter.clazzadapter;

import org.xufeng.deng.patterns.structure.adapter.Adaptee;
import org.xufeng.deng.patterns.structure.adapter.Target;

/**
 * Created by deng.xufeng(一乐) on 2017/6/15.
 * <p>类适配器，适配（继承）普通类（Target实现）和待适配类(Adaptee)
 *
 * @author deng.xufeng
 */
public class Adapter extends Adaptee implements Target {
    public void request() {
        super.specificRequest();
    }
}
