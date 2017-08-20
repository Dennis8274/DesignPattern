package org.xufeng.deng.patterns.creation.prototype.deep.serialization;

import java.io.*;

/**
 * Created by deng.xufeng(一乐) on 2017/4/29.
 * <p>
 *
 * @author deng.xufeng
 */
public class NewSerializationPrototype implements Serializable {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private SerializationPrototype serializationPrototype;

    public SerializationPrototype getSerializationPrototype() {
        return serializationPrototype;
    }

    public void setSerializationPrototype(SerializationPrototype serializationPrototype) {
        this.serializationPrototype = serializationPrototype;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }

    @Override
    public String toString() {
        return "NewSerializationPrototype{" +
                "id='" + id + '\'' +
                ", serializationPrototype=" + serializationPrototype +
                '}';
    }
}
