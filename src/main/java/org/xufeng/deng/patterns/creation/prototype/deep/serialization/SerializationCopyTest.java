package org.xufeng.deng.patterns.creation.prototype.deep.serialization;

import java.io.IOException;

/**
 * Created by deng.xufeng(一乐) on 2017/4/29.
 * <p>
 *
 * @author deng.xufeng
 */
public class SerializationCopyTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationPrototype serializationPrototype = new SerializationPrototype();
        serializationPrototype.setName("originalName");
        NewSerializationPrototype newSerializationPrototype = new NewSerializationPrototype();
        newSerializationPrototype.setId("originalId");
        newSerializationPrototype.setSerializationPrototype(serializationPrototype);

        NewSerializationPrototype copyPrototype = (NewSerializationPrototype)newSerializationPrototype.deepClone();
        System.out.println(copyPrototype);
    }
}
