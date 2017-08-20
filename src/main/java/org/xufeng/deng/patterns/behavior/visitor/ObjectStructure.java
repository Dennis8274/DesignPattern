package org.xufeng.deng.patterns.behavior.visitor;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p>
 *
 * @author deng.xufeng
 */
public class ObjectStructure {
    private List<Element> structure = Lists.newArrayList();

    public void add(Element element){
        structure.add(element);
    }

    public void remove(Element element){
        structure.remove(element);
    }

    public void accept(Visitor visitor){
        for (final Element element:structure){
            element.accept(visitor);
        }
    }
}
