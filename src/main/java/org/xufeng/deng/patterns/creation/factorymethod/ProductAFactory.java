package org.xufeng.deng.patterns.creation.factorymethod;

/**
 * Created by deng.xufeng(一乐) on 2017/4/28.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class ProductAFactory implements AbstractFactory {
    public Product createProduct() {
        return new ProductA();
    }
}
