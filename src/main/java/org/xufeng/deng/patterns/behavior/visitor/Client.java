package org.xufeng.deng.patterns.behavior.visitor;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        ObjectStructure objectStructure = new ObjectStructure();
        ConcreteElementLyo lyo = new ConcreteElementLyo();
        ConcreteElementSyo syo = new ConcreteElementSyo();
        objectStructure.add(lyo);
        objectStructure.add(syo);
        objectStructure.accept(new ConcreteVisitor());
    }
}
