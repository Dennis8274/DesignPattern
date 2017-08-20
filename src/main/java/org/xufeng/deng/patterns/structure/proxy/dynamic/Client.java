package org.xufeng.deng.patterns.structure.proxy.dynamic;

import org.xufeng.deng.patterns.structure.proxy.RealSubject;
import org.xufeng.deng.patterns.structure.proxy.Subject;

/**
 * Created by deng.xufeng(一乐) on 2017/6/17.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Subject subject = new RealSubject();
        System.out.println(subject.getClass());

        Subject proxySubject = (Subject) new ProxyFactory(subject).getInstanceSubject();
        System.out.println(proxySubject.getClass());

        proxySubject.action();
    }
}
