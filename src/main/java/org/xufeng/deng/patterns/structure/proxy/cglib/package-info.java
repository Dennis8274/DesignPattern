/**
 * Created by deng.xufeng(一乐) on 2017/6/17.
 * <p>目标对象可没实现接口（动态代理必须），代理类不可为final，
 * 目标对象的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法
 *
 * @author deng.xufeng
 */
package org.xufeng.deng.patterns.structure.proxy.cglib;