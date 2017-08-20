package org.xufeng.deng.patterns.creation.prototype.deep;

/**
 * Created by deng.xufeng(一乐) on 2017/4/29.
 * <p>
 *
 * @author deng.xufeng
 */
public class DeepPrototype implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "name='" + name + '\'' +
                '}';
    }
}
