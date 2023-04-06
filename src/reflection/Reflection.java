package reflection;
import java.lang.reflect.*;

public class Reflection {
    private Class c;
    private Object object;

    /**
     * Constructor for when fields aren't important. An instance of the object isn't required.
     *
     * @param className Name of the class you want analyzed
     * @throws ClassNotFoundException You likely spelled the name wrong or didn't include the package
     */
    public Reflection(String className) throws ClassNotFoundException {
        c = Class.forName(className);
    }

    public Reflection(String className, Object objectName) throws ClassNotFoundException {
        c = Class.forName(className);
        object = objectName;
    }

    public void setClass(String className) throws ClassNotFoundException {
        c = Class.forName(className);
    }

    public void fullTest() throws IllegalAccessException {
        examineClass();
        examineConstructors();
        examineMethods();
        examineFields();
    }

    public void examineMethods(){
        System.out.println("<--Examining Methods-->");
        Method[] m = c.getDeclaredMethods();
        Class[] params;
        for (Method method : m) {
            System.out.println("Name: " + method.getName());
            System.out.println("Modifier: " + Modifier.toString(method.getModifiers()));
            System.out.println("Return type: " + method.getReturnType());
            params = method.getParameterTypes();
            //in case there's no parameters at all, indicate it
            if (params.length == 0){
                System.out.println("Parameters: None");
            }
            else{
                System.out.println("Parameters: ");
                for (int i = 0; i < params.length; i++){
                    System.out.println("    " + params[i].getName());
                }
            }
            System.out.println();
        }
    }

    public void examineConstructors(){
        System.out.println("<--Examining Constructors-->");
        Constructor[] constructors = c.getConstructors();
        Class[] params;
        for (Constructor constructor : constructors) {
            System.out.println("Name: " + constructor.getName());
            System.out.println("Modifiers: " + Modifier.toString(constructor.getModifiers()));
            params = constructor.getParameterTypes();
            //in case there's no parameters at all, indicate it
            if (params.length == 0){
                System.out.println("Parameters: None");
            }
            else{
                System.out.println("Parameters: ");
                for (int i = 0; i < params.length; i++){
                    System.out.println("    " + params[i].getName());
                }
            }
            System.out.println();
        }
    }

    public void examineFields() throws IllegalAccessException {
        System.out.println("<--Examining Fields-->");
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("Name: " + field.getName());
            System.out.println("Modifiers: " + field.getModifiers());
            System.out.println("Value: " + field.get(object) + "\n");
        }
    }

    public void examineClass(){
        System.out.println("<----------Examining Class: " + c.getName() + "---------->");
    }
}
