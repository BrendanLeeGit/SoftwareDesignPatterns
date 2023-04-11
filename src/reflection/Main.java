package reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException, NoSuchFieldException {
        ReflectionTest r = new ReflectionTest();
        r.run();
    }
}
