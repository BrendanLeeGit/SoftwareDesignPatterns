package serialization;

import reflection.Reflection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class SerializeTester<E> {
    private E object;

    public void run(String filePath) throws IOException, ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        //create virus and then serialize it with serializer
        Virus v = new Virus("Beezle");
        Serializer<Virus> s = new Serializer<>(v, filePath);
        s.serialize();

        //create deserializer and deserialize stuff
        Deserializer d = new Deserializer<>();
        d.deserialize(filePath);
        object = (E) d.getObject();

        //attempt to call methods from the serialized object with reflection
        Reflection r = new Reflection(object);
        r.runMethodsWithNoParameters();
        r.fullTest();
    }
}
