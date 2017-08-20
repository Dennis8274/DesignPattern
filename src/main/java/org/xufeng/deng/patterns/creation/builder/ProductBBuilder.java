package org.xufeng.deng.patterns.creation.builder;

/**
 * Created by deng.xufeng(一乐) on 2017/4/27.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class ProductBBuilder implements Builder {
    private Product product;

    public ProductBBuilder() {
        product = new ProductB();
    }

    public void buildSomething() {
        product.setSomething("B的something构造");
    }

    public void buildAnother() {
        product.setAnother("B的another构造");
    }

    public Product buildProduct() {
        return product;
    }
}
