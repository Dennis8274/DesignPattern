package org.xufeng.deng.patterns.behavior.iterator;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        List<Object> list = Lists.newArrayList();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(9);

        Aggregate aggregate = new ConcreteAggregate(list);
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
