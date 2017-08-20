package org.xufeng.deng.patterns.structure.composite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/6/16.
 * <p>
 *
 * @author deng.xufeng
 */
public class ChildComposite implements Component {
    private List<Component> components = Lists.newArrayList();

    public ChildComposite() {
        components.add(new TwoLeaf());
        components.add(new ThreeLeaf());
    }

    public void sayName() {
        for (Component component:components){
            component.sayName();
        }
    }
}
