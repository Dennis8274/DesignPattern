package org.xufeng.deng.patterns.structure.decorator;

/**
 * Created by deng.xufeng(一乐) on 2017/6/16.
 * <p>
 *
 * @author deng.xufeng
 */
public class ConcreteComponent implements Component {
    public void sayName() {
        System.out.println("Concrete component");
    }
}
