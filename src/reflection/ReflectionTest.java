package reflection;

import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
    public void run() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException, NoSuchFieldException {
        Reflection r = new Reflection();
        r.fullTest();
        r.changeFields("name", "Poop");
        r.fullTest();

        Reflection string = new Reflection("f");
        string.fullTest();
    }
}
