package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer<E> {
    E object;

    /**
     * Unserializes the file and stores it in object.
     *
     * @param filePath The filepath to the serialized file.
     * @throws IOException Self
     * @throws ClassNotFoundException Explanatory
     */
    public void deserialize(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(filePath);
        ObjectInputStream oIS = new ObjectInputStream(fileIn);
        object = (E) oIS.readObject();
    }

    public E getObject() {
        return object;
    }
}
