package org.xufeng.deng.patterns.structure.composite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/6/16.
 * <p>
 *
 * @author deng.xufeng
 */
public class ParentComposite implements Component {
    private List<Component> components = Lists.newArrayList();

    public ParentComposite() {
        components.add(new OneLeaf());
        components.add(new ChildComposite());
    }

    public void sayName() {
        for (Component component:components){
            component.sayName();
        }
    }
}
