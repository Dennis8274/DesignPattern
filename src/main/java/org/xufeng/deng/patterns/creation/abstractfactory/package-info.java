/**
 * Created by deng.xufeng(一乐) on 2017/4/25.
 * <p>抽象工厂方法
 * 在意继承
 * 不直接new 具体产品{@link org.xufeng.deng.patterns.creation.abstractfactory.ProductA},{@link org.xufeng.deng.patterns.creation.abstractfactory.ProductB}
 * 由不同工厂factory生产，不同类型(1 OR 2)工厂生产不同类型(1 OR 2)产品的接口都是一样的，要得到不同产品，只需要创建不同类型（1 OR 2）的工厂，并且在工厂中实现创建产品接口
 * @author deng.xufeng
 */
package org.xufeng.deng.patterns.creation.abstractfactory;