package serialization;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        SerializeTester s = new SerializeTester();
        s.run("C:/Users/brend/OneDrive/Desktop/SerializedFiles/Virus.ser");
    }
}
