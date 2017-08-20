package org.xufeng.deng.patterns.structure.proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by deng.xufeng(一乐) on 2017/6/17.
 * <p>目标对象一定要实现接口
 *
 * @author deng.xufeng
 */
public class ProxyFactory {
    private Object subject;

    public ProxyFactory(Object subject) {
        this.subject = subject;
    }

    public Object getInstanceSubject() {
        return Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理开始前的处理");
                        Object retValue = method.invoke(subject,args);
                        System.out.println("代理结束后的处理");
                        return retValue;
                    }
                }

//                (proxy, method, args) -> {
//                    System.out.println("代理开始前的处理");
//                    Object retValue = method.invoke(subject, args);
//                    System.out.println("代理结束后的处理");
//                    return retValue;
//                }
        );
    }
}
