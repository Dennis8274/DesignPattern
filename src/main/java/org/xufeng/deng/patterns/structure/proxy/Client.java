package org.xufeng.deng.patterns.structure.proxy;

/**
 * Created by deng.xufeng(一乐) on 2017/6/17.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Subject subject = new ProxySubject(new RealSubject());
        subject.action();
    }
}
