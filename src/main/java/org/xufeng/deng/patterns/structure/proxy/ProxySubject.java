package org.xufeng.deng.patterns.structure.proxy;

/**
 * Created by deng.xufeng(一乐) on 2017/6/17.
 * <p>
 *
 * @author deng.xufeng
 */
public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    public void action() {
        System.out.println("开始代理");
        subject.action();
        System.out.println("结束代理");
    }
}
