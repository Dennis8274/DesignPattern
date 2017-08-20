package org.xufeng.deng.patterns.structure.flyweight;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by deng.xufeng(一乐) on 2017/6/17.
 * <p>
 *
 * @author deng.xufeng
 */
public class FlyweightFactory {
    private static Map<String,Flyweight> flyweights = Maps.newHashMap();

    public FlyweightFactory(String arg,ConcreteFlyweight flyweight) {
        flyweights.put(arg,flyweight);
    }

    public static Flyweight getFlyweight(String key){
        if (flyweights.get(key)==null){
            flyweights.put(key,new ConcreteFlyweight());
        }
        return flyweights.get(key);
    }
}
