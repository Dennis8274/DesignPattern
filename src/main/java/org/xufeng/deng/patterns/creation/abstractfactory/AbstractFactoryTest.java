package org.xufeng.deng.patterns.creation.abstractfactory;

/**
 * Created by deng.xufeng(一乐) on 2017/4/26.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class AbstractFactoryTest {

    public static void main(String[] args){
        AbstractFactory factoryTypeOf1 = new ProductOfType1Factory();
        AbstractFactory factoryTypeOf2 = new ProductOfType2Factory();

        ProductA a1 = factoryTypeOf1.createProductA();
        ProductB b1 = factoryTypeOf1.createProductB();
        a1.executeA();
        b1.executeB();

        ProductA a2 = factoryTypeOf2.createProductA();
        ProductB b2 = factoryTypeOf2.createProductB();
        a2.executeA();
        b2.executeB();
    }
}
