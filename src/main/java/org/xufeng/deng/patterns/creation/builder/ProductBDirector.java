package org.xufeng.deng.patterns.creation.builder;

/**
 * Created by deng.xufeng(一乐) on 2017/4/27.
 * <p>
 *
 * @author deng.xufeng
 */
public class ProductBDirector implements Director {
    public Product constructProduct(Builder concreteBuilder) {
        concreteBuilder.buildSomething();
        concreteBuilder.buildAnother();
        return concreteBuilder.buildProduct();
    }
}
