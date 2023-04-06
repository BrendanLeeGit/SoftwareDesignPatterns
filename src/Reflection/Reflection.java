package Reflection;
import java.lang.reflect.*;

public class Reflection {
    private Class c;
    private Object object;

    public Reflection(String className) throws ClassNotFoundException {
        c = Class.forName(className);
    }

    public Reflection(String className, Object objectName) throws ClassNotFoundException {
        c = Class.forName(className);
        object = objectName;
    }

    public void fullTest() throws IllegalAccessException {
        examineConstructors();
        examineMethods();
        examineFields();
    }

    public void examineMethods(){
        System.out.println("<--Examining Methods-->");
        Method m[] = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++){
            System.out.println("Name: " + m[i].getName());
            System.out.println("Modifier: " + m[i].getModifiers());
            System.out.println("Return type: " + m[i].getReturnType() + "\n");
        }
    }

    public void examineConstructors(){
        System.out.println("<--Examining Constructors-->");
        Constructor[] constructors = c.getConstructors();
        for (int i = 0; i < constructors.length; i++){
            System.out.println("Name: " + constructors[i].getName());
            System.out.println("Modifiers: " + constructors[i].getModifiers());
            System.out.println("Modifiers: " + constructors[i].getParameterTypes());
            System.out.println("Parameter Count: " + constructors[i].getParameterCount() + "\n");
        }
    }

    public void examineFields() throws IllegalAccessException {
        System.out.println("<--Examining Fields-->");
        Field[] fields = c.getDeclaredFields();
        for (int i = 0; i < fields.length; i++){
            fields[i].setAccessible(true);
            System.out.println("Name: " + fields[i].getName());
            System.out.println("Modifiers: " + fields[i].getModifiers());
            System.out.println("Value: " + fields[i].get(object) + "\n");
        }
    }
}
