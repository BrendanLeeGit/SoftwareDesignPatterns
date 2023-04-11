package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializer<E> {
    private E object;
    private String filePath;

    public Serializer(E object, String filePath){
        this.object = object;
        this.filePath = filePath;
    }

    public void setObject(E object){
        this.object = object;
    }

    /**
     * Serializes the object and places it in the specified filepath
     *
     * @throws IOException No clue
     */
    public void serialize() throws IOException {
        FileOutputStream serialFile =  new FileOutputStream(filePath);
        ObjectOutputStream fileOutput = new ObjectOutputStream(serialFile);
        fileOutput.writeObject(object);
        serialFile.close();
        fileOutput.close();
    }
}
