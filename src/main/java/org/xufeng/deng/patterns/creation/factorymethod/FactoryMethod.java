package org.xufeng.deng.patterns.creation.factorymethod;

/**
 * Created by deng.xufeng(一乐) on 2017/4/28.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class FactoryMethod {
    public static void main(String[] args){
        AbstractFactory factoryA = new ProductAFactory();
        Product productA = factoryA.createProduct();
        productA.execute();

        AbstractFactory factoryB = new ProductBFactory();
        Product productB = factoryB.createProduct();
        productB.execute();
    }
}
