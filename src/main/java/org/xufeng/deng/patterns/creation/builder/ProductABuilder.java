package org.xufeng.deng.patterns.creation.builder;

/**
 * Created by deng.xufeng(一乐) on 2017/4/27.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class ProductABuilder implements Builder {
    private Product product;

    public ProductABuilder() {
        product = new ProductA();
    }

    public void buildSomething() {
        product.setSomething("A的something构造");
    }

    public void buildAnother() {
        product.setAnother("A的another构造");
    }

    public Product buildProduct() {
        return product;
    }
}
