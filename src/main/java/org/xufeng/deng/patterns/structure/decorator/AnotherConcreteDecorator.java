package org.xufeng.deng.patterns.structure.decorator;

/**
 * Created by deng.xufeng(一乐) on 2017/6/16.
 * <p>
 *
 * @author deng.xufeng
 */
public class AnotherConcreteDecorator extends Decorator {
    public AnotherConcreteDecorator(Component component) {
        super(component);
    }

    public void sayName(){
        super.sayName();
        decorateSayName();
    }

    public void decorateSayName(){
        System.out.print(" 添加一般属性");
    }
}
