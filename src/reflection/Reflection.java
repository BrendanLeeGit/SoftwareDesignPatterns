package reflection;
import java.lang.reflect.*;

public class Reflection {
    private Class c;
    private Object object;

    public Reflection() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<ExampleClass> con = ExampleClass.class.getConstructor(boolean.class);
        object = con.newInstance(true);
        c = object.getClass();
    }

    public Reflection(Object object){
        this.object = object;
        c = object.getClass();
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
                for (Class param : params) {
                    System.out.println("    " + param.getName());
                }
            }
            System.out.println("Return type: " + method.getReturnType() + "\n");
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
                for (Class param : params) {
                    System.out.println("    " + param.getName() + "\n");
                }
            }
        }
    }

    public void examineFields() throws IllegalAccessException {
        System.out.println("<--Examining Fields-->");
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("Name: " + field.getName());
            System.out.println("Type: " + field.getType());
            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
            System.out.println("Value: " + field.get(object) + "\n");
        }
    }

    public void changeFields(String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        Field f = c.getField(fieldName);
        f.setAccessible(true);
        f.set(object, fieldValue);
        f.setAccessible(false);
    }

    public void examineClass(){
        System.out.println("<----------Examining Class: " + c.getName() + "---------->");
    }
}
