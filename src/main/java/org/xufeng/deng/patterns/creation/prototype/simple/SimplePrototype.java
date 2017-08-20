package org.xufeng.deng.patterns.creation.prototype.simple;

/**
 * Created by deng.xufeng(一乐) on 2017/4/29.
 * <p>
 *
 * @author deng.xufeng
 */
public class SimplePrototype {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimplePrototype{" +
                "name='" + name + '\'' +
                '}';
    }
}
