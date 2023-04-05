package Reflection;
import java.lang.reflect.*;

public class ReflectionTest {
    public static void main(String args[])
    {
        ExampleClass ex = new ExampleClass();
        try {
            //Class c = Class.forName(args[0]);
            Class c = Class.forName("Reflection.ExampleClass");
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++){
                System.out.println(m[i].toString());
            }
            Constructor[] constructors = c.getConstructors();
            for (int i = 0; i < constructors.length; i++){
                System.out.println(constructors[i].toString());
            }
            Field[] fields = c.getDeclaredFields();

            for (int i = 0; i < fields.length; i++){
                fields[i].setAccessible(true);
                System.out.println(fields[i].toString());
                System.out.println(fields[i].get(ex));
            }
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}
