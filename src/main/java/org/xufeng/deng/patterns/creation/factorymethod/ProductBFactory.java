package org.xufeng.deng.patterns.creation.factorymethod;

/**
 * Created by deng.xufeng(一乐) on 2017/4/28.
 * <p>
 *
 * @author deng.xufeng
 */
public class ProductBFactory implements AbstractFactory {
    public Product createProduct() {
        return new ProductB();
    }
}
