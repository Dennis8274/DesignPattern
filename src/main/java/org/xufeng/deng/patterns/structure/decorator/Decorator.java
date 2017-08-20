package org.xufeng.deng.patterns.structure.decorator;

/**
 * Created by deng.xufeng(一乐) on 2017/6/16.
 * <p>
 *
 * @author deng.xufeng
 */
public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void sayName() {
        component.sayName();
    }

    protected abstract void decorateSayName();
}
