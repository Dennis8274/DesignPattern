package org.xufeng.deng.patterns.creation.abstractfactory;

/**
 * Created by deng.xufeng(一乐) on 2017/4/26.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class ProductOfType1Factory extends AbstractFactory {
    public ProductA createProductA() {
        return new ProductA1();
    }

    public ProductB createProductB() {
        return new ProductB1();
    }
}
